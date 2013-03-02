
package evolalgo;

import evolalgo.adultselectors.IAdultSelection;
import evolalgo.parentselectors.IParentSelection;
import evolalgo.problem.IProblem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is the evolutionary loop.
 * @author Odd
 */
public class Evolution {
    //TODO Number of children in over population should be implicit 
    private int populationSize;
    private IAdultSelection adSel;
    private IParentSelection parSel;
    private IProblem problem;
    private IReproduction rep;
    
    List<Map> stats;
    
    public Evolution(int populationSize, IReproduction rep,
            IAdultSelection adSel, IParentSelection parSel, 
            IProblem problem){
        this.rep = rep;
        this.populationSize = populationSize;
        this.adSel = adSel;
        this.parSel = parSel;
        this.problem = problem;
        stats = new ArrayList<Map>();
    }
    
    public List<IIndividual> runGeneration(List<IIndividual> individuals) throws Exception{        
        //Make phenotypes if they don't already exist.
        for(int i = 0; i < individuals.size(); i++){
            problem.developPheno(individuals.get(i));
        }
        //Finding fitness
        problem.calculateFitness(individuals);
        //Try replacing the generation
        try{
            individuals = adSel.getAdults(individuals);
        }catch(Exception e){
        	e.printStackTrace();
        	String error = "Error replacing generation using "+adSel.toString();
            throw new Exception(error,e);
        }
        
       Map statistics = fitnessCalculations(individuals);
        //Start producing children.
        List<IIndividual> children = new ArrayList<IIndividual>();
        produceChildren(children, individuals);
        stats.add(statistics);
        return individuals;
    }

    public void loop(int generations, boolean stop) throws Exception{
        List<IIndividual> individuals = problem.createPopulation(populationSize);
        for (int i = 0; i < generations; i++){
            individuals = runGeneration(individuals);
            if(stop){
                Map m = stats.get(stats.size() - 1);
                if (Double.parseDouble(m.get("maxFitness").toString()) == 1.0){
                    break;
                }
            }
        }
    }
    
    private Map fitnessCalculations(List<IIndividual> individuals){
    	Map statistics = new HashMap();
    	//Find average fitness and highest/lowest
    	double countFitness = 0;
    	double maxFitness = 0.0;
    	double minFitness = 10.0;

    	for(IIndividual i: individuals){
    		try {
    			countFitness += i.fitness();
    			if(i.fitness() > maxFitness){
    				maxFitness = i.fitness();
    				statistics.put("maxFitness", maxFitness);
    				statistics.put("bestIndividual", i);
    			}
    			if(i.fitness() < minFitness){
    				minFitness = i.fitness();
    				statistics.put("minFitness", minFitness);
    			}

    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}

    	}statistics.put("avgFitness", countFitness / individuals.size());
    	
    	return statistics;
    }
    
    private void produceChildren(List<IIndividual> children, List<IIndividual> individuals) throws Exception{
    	
    	   	
    	while(children.size() < populationSize){
            List<IIndividual> parents = new ArrayList<IIndividual>();
            //Try selecting parents!
            IIndividual firstParent = parSel.getParent(individuals);
            parents.add(firstParent);
            List<IIndividual> otherindividuals = new ArrayList<IIndividual>(individuals);
            otherindividuals.remove(firstParent);
            parents.add(parSel.getParent(otherindividuals));
            try{
                Object[] newGenes = rep.reproduce(parents);
                for(int k = 0; k < newGenes.length; k++){
                    if(children.size() < populationSize){ 
                        children.add(new IndividualImpl(newGenes[k]));
                    }
                }
            }catch(Exception e){
                throw new Exception("Error in reproduction?",e);
            }
        }
        individuals.addAll(children);
    }
    
    //TODO: P�begynt metode, har en plan her :P
//    private void overproduceChildren(List<IIndividual> children, List<IIndividual> individuals) throws Exception{
//    	
//    	List<IIndividual> parents = new ArrayList<IIndividual>();
//    	
//    	for (IIndividual iIndividual : individuals) {
//			parents.add(parSel.getParent(individuals));
//		}
//    	
//    }
    
    
    public List<Map> getStatistics(){
        return stats;
    }
}