
package evolalgo;

import java.util.List;

/**
 * Reproduction classes must implement this interface. Mutation and recombination
 * rates are handled by the constructor.
 * @author Odd
 */
public interface Reproduction {
    
    /**
     * Mutate a genotype
     * @param genotype The input genotype, a string of bits.
     * @return The mutated genotype, also in bit string form.
     * @throws Exception 
     */
    Object mutation(Object genotype) throws Exception;
    
    /**
     * Recombine the genes of two parents.
     * @param parents List of parent individuals
     * @return Two recombined genotypes, ready to be formed into new individuals
     */
    Object[] crossover(List<Individual> parents) throws Exception;
    
    /**
     * This class combines recombination and mutation and returns two children
     * @param parents Two parent individuals
     * @return Two recombined and mutated genotypes.
     */
    Object[] reproduce(List<Individual> parents) throws Exception;
    
    double getMutationRate();
    
    void setMutationRate(double mutationRate);
}
