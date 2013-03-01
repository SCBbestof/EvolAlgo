/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import evolalgo.Evolution;
import evolalgo.IIndividual;
import evolalgo.IReproduction;
import evolalgo.ReproductionImpl;
import evolalgo.adultselectors.FullGenReplacement;
import evolalgo.adultselectors.GenerationalMixing;
import evolalgo.adultselectors.IAdultSelection;
import evolalgo.adultselectors.OverProduction;
import evolalgo.parentselectors.FitnessProportionate;
import evolalgo.parentselectors.IParentSelection;
import evolalgo.parentselectors.SigmaScaling;
import evolalgo.parentselectors.Tournament;
import evolalgo.problem.BlottoStrats;
import evolalgo.problem.IProblem;
import evolalgo.problem.MaxOne;
import evolalgo.problem.SpikingNeuron;
import evolalgo.problem.sdm.ISDM;
import evolalgo.problem.sdm.SpikeIntervalDistance;
import evolalgo.problem.sdm.SpikeTimeDistance;
import evolalgo.problem.sdm.WaveformDistance;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.math.plot.Plot2DPanel;
import org.math.plot.plotObjects.BaseLabel;

/**
 *
 * @author Odd
 */
public class EvoGUI extends javax.swing.JFrame {

    private IProblem problem;
    /**
     * Creates new form GUI2
     */
    public EvoGUI() {
        initComponents();
        adultPanel.add(new JPanel());
        adultPanel.add(new AdultOverproductionPanel());
        adultPanel.add(new AdultGenMixingPanel());
        
        problemPane.add(new ProblemMaxOne());
        problemPane.add(new ProblemBlottoPanel());
        problemPane.add(new ProblemSpikingGUI());
        
        parentPane.add(new JPanel());
        parentPane.add(new JPanel());
        parentPane.add(new ParentTournamentPanel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        problemPane = new javax.swing.JPanel();
        problemBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        adultBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        adultPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        parentBox = new javax.swing.JComboBox();
        parentPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mutationRateField = new javax.swing.JTextField();
        crossoverRateField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        crossoverSplitSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputScreen = new javax.swing.JTextArea();
        graphpanel = new javax.swing.JPanel();
        launchButton = new javax.swing.JButton();
        generationsField = new javax.swing.JTextField();
        populationSizeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        previousGraph = new javax.swing.JButton();
        nextGraph = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        problemPane.setLayout(new java.awt.CardLayout());

        problemBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Max One", "Blotto Strategies", "Spiking Neuron" }));
        problemBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problemBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Problem:");

        adultBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Full Generational Replacement", "Overproduction", "Generational Mixing" }));
        adultBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Adult Selection Mechanism: ");

        adultPanel.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Parent Selection Mechanism:");

        parentBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fitness Proportionate", "Sigma Scaling", "Tournament" }));
        parentBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentBoxActionPerformed(evt);
            }
        });

        parentPane.setLayout(new java.awt.CardLayout());

        jLabel4.setText("Mutation %:");

        mutationRateField.setText("5");

        crossoverRateField.setText("80");

        jLabel5.setText("Crossover %:");

        crossoverSplitSlider.setMaximum(2);
        crossoverSplitSlider.setMinimum(1);

        jLabel6.setText("Crossover splits (1-2):");

        outputScreen.setColumns(20);
        outputScreen.setRows(5);
        jScrollPane1.setViewportView(outputScreen);

        graphpanel.setLayout(new java.awt.CardLayout());

        launchButton.setText("Launch");
        launchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchButtonActionPerformed(evt);
            }
        });

        generationsField.setText("100");

        populationSizeField.setText("50");

        jLabel7.setText("Generations:");

        jLabel8.setText("Population size:");

        previousGraph.setText("<");
        previousGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousGraphActionPerformed(evt);
            }
        });

        nextGraph.setText(">");
        nextGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextGraphActionPerformed(evt);
            }
        });

        jButton3.setText(">>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(problemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(problemPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(adultBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(adultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(parentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(parentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(generationsField)
                                                .addComponent(populationSizeField)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(crossoverSplitSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(crossoverRateField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                .addComponent(mutationRateField)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(launchButton)))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(graphpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousGraph)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextGraph)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(problemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(problemPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adultBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(mutationRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crossoverRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crossoverSplitSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generationsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(populationSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(launchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(graphpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousGraph)
                    .addComponent(nextGraph)
                    .addComponent(jButton3)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adultBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultBoxActionPerformed
        CardLayout adultCard = (CardLayout) adultPanel.getLayout();
        if(adultBox.getSelectedIndex() == 0){
            adultCard.first(adultPanel);
        }else if(adultBox.getSelectedIndex() == 1){
            adultCard.first(adultPanel);
            adultCard.next(adultPanel);
        }else if(adultBox.getSelectedIndex() == 2){
            adultCard.last(adultPanel);
        }
    }//GEN-LAST:event_adultBoxActionPerformed

    private void parentBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentBoxActionPerformed
        CardLayout parentCard = (CardLayout) parentPane.getLayout();
        if(parentBox.getSelectedIndex() == 2){
            parentCard.last(parentPane);
        }else {
            parentCard.first(parentPane);
        }
    }//GEN-LAST:event_parentBoxActionPerformed

    private void problemBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problemBoxActionPerformed
        CardLayout problemCard = (CardLayout) problemPane.getLayout();
        if(problemBox.getSelectedIndex() == 0){
            problemCard.first(problemPane);
        }else if(problemBox.getSelectedIndex() == 1){
            problemCard.first(problemPane);
            problemCard.next(problemPane);
        }else{
            problemCard.last(problemPane);
        }
    }//GEN-LAST:event_problemBoxActionPerformed

    private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchButtonActionPerformed
        int generations = Integer.parseInt(generationsField.getText());
        int populationSize = Integer.parseInt(populationSizeField.getText());
        int crossoverSplit = crossoverSplitSlider.getValue();
        int crossoverRate = Integer.parseInt(crossoverRateField.getText());
        int mutation = Integer.parseInt(mutationRateField.getText());
        
        AdultOverproductionPanel overproduction = (AdultOverproductionPanel) adultPanel.getComponent(1);
        int overProductionPercent = Integer.parseInt(overproduction.overproductionField.getText());
        
        AdultGenMixingPanel genMix = (AdultGenMixingPanel) adultPanel.getComponent(2);
        int adultSpots = Integer.parseInt(genMix.adultSpots.getText());
        
        ParentTournamentPanel tournamentPane = (ParentTournamentPanel) parentPane.getComponent(2);
        int tournamentSize = Integer.parseInt(tournamentPane.tournamentSizeField.getText());
        int pickBest = Integer.parseInt(tournamentPane.pickBestField.getText());
        
        ProblemMaxOne maxOne = (ProblemMaxOne) problemPane.getComponent(0);
        int maxOnebitSize = Integer.parseInt(maxOne.maxOneSizeField.getText());
        String maxOneManualBit = maxOne.maxOneManualField.getText();
        
        ProblemBlottoPanel blotto = (ProblemBlottoPanel) problemPane.getComponent(1);
        int blottoBattles = Integer.parseInt(blotto.battleField.getText());
        int blottoRedeployment = Integer.parseInt(blotto.redeploymentField.getText());
        int blottoLoss = Integer.parseInt(blotto.lossFractionField.getText());
        
        ProblemSpikingGUI spiking = (ProblemSpikingGUI) problemPane.getComponent(2);
        int spikingTrain = spiking.trainingDataBox.getSelectedIndex() + 1;
        
        ISDM sdm = null;
        switch(spiking.SDMBox.getSelectedIndex()){
            case 0:
                sdm = new WaveformDistance();
                break;
            case 1:
                sdm = new SpikeIntervalDistance();
                break;
            case 2:
                sdm = new SpikeTimeDistance();
                break;
        }
        
        IReproduction reproduction = null;
        try {
            reproduction = new ReproductionImpl((double) mutation / 100.0, 
                    (double) crossoverRate / 100.0, crossoverSplit);
        } catch (Exception ex) {
            Logger.getLogger(EvoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        problem = null;
        switch(problemBox.getSelectedIndex()){
            case 0:
                if(maxOne.bitSizeButton.isSelected()){
                    problem = new MaxOne("", maxOnebitSize);
                }else{
                    problem = new MaxOne(maxOneManualBit, maxOnebitSize);
                }
                break;
            case 1:
                problem = new BlottoStrats(blottoBattles, (double) blottoRedeployment / 100.0, 
                        (double) blottoLoss / 100);
                break;
            case 2:
                problem = new SpikingNeuron(spikingTrain, sdm);
                break;
        }
        
        IAdultSelection adultSelection = null;
        switch(adultBox.getSelectedIndex()){
            case 0:
                adultSelection = new FullGenReplacement();
                break;
            case 1:
                adultSelection = new OverProduction((double)overProductionPercent / 100);
                break;
            case 2:
                adultSelection = new GenerationalMixing(adultSpots);
                break;
        }
        
        IParentSelection parentSelection = null;
        switch(parentBox.getSelectedIndex()){
            case 0:
                parentSelection = new FitnessProportionate();
                break;
            case 1:
                parentSelection = new SigmaScaling();
                break;
            case 2:
                parentSelection = new Tournament(tournamentSize, (double) pickBest / 100);
                break;
        }
        //TODO: Hvordan finner vi ut av populasjon?
        Evolution evo = new Evolution(populationSize, reproduction, adultSelection, parentSelection, problem);
        
        switch(problemBox.getSelectedIndex()){
            case 0:
                runMaxOneProblem(evo);
                break;
            case 1:
                runBlottoProblem(evo);
                break;
            case 2:
                runSpikingProblem(evo);
                break;
        }
    }//GEN-LAST:event_launchButtonActionPerformed

    private void runMaxOneProblem(Evolution evo){
        int generations = Integer.parseInt(generationsField.getText());
        try {
            evo.loop(generations, true); //TODO: ikke skyt inn 'individuals' her?
        }catch (Exception ex) {
            ex.getMessage();
        }
        List<Map> statistics = evo.getStatistics();
        String formattedString = "";
        double[] maxfitnessplot = new double[generations];
        double[] avgfitnessplot = new double[generations];
        double[] minfitnessplot = new double[generations];
        int i = 0;
        for(Map m: statistics){
            formattedString += "Generation:" + (i+1) + "\t Best: " +
                    m.get("bestIndividual").toString() + "\n";
            maxfitnessplot[i] = Double.parseDouble(m.get("maxFitness").toString());
            avgfitnessplot[i] = Double.parseDouble(m.get("avgFitness").toString());
            minfitnessplot[i] = Double.parseDouble(m.get("minFitness").toString());
            i++;
        }
        Plot2DPanel plot;
        plot = new Plot2DPanel();
        double[] scaler = {1.0};
        plot.addScatterPlot("", scaler);
        plot.addLinePlot("Max fitness", Color.RED, maxfitnessplot);
        plot.addLinePlot("Average fitness", Color.ORANGE, avgfitnessplot);
        plot.addLinePlot("Minimum fitness", Color.BLUE, minfitnessplot);
        plot.addLegend("SOUTH");
        BaseLabel title = new BaseLabel(problemBox.getSelectedItem().toString() + ", " + 
                adultBox.getSelectedItem().toString() + ", " + 
                parentBox.getSelectedItem().toString() + ", mutation: " + 
                mutationRateField.getText() + "%, crossover: " + 
                crossoverRateField.getText() + "%"
                , Color.BLACK, 0.5, 1.1);
        plot.addPlotable(title);
        graphpanel.add(plot);
        CardLayout card = (CardLayout) graphpanel.getLayout();
        card.last(graphpanel);
        outputScreen.setText(formattedString);
    }
    
    private void runBlottoProblem(Evolution evo){
        int generations = Integer.parseInt(generationsField.getText());
        int populationSize = Integer.parseInt(populationSizeField.getText());
        double[] avgEntropy = new double[generations];
        double[] stdDev = new double[generations];
        List<IIndividual> individuals = problem.createPopulation(populationSize);
        try {
            for (int i = 0; i < generations; i++){
                individuals = evo.runGeneration(individuals);
                double[] fitnesses = new double[populationSize];
                int numParents = 0;
                for(IIndividual ind: individuals){
                    if(ind.age() > 0){
                        fitnesses[numParents] = ind.fitness();
                        String pheno = ind.phenotype().toString().trim();
                        String[] phenosplit = pheno.split(";");
                        double sum = 0.0;
                        for (int j = 0; j < phenosplit.length; j++){
                            phenosplit[j] = phenosplit[j].replace(',', '.');
                            double value = Double.parseDouble(phenosplit[j].trim());
                            if (value != 0.0){
                                double logcalc = (value * (Math.log(value)/Math.log(2.0)));
                                sum -= logcalc;
                            }
                        }

                        avgEntropy[i] += sum;
                        numParents++;
                    }
                }
                avgEntropy[i] = avgEntropy[i] / (double)numParents;
                stdDev[i] = StandardDeviation.StandardDeviationMean(fitnesses);
            }

        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }
        List<Map> statistics = evo.getStatistics();
        String formattedString = "";
        double[] maxfitnessplot = new double[generations];
        double[] avgfitnessplot = new double[generations];
        double[] minfitnessplot = new double[generations];
        int i = 0;
        for(Map m: statistics){
            formattedString += "Generation:" + (i+1) + "\t Best: " +
                    m.get("bestIndividual").toString() + "\n";
            maxfitnessplot[i] = Double.parseDouble(m.get("maxFitness").toString());
            avgfitnessplot[i] = Double.parseDouble(m.get("avgFitness").toString());
            minfitnessplot[i] = Double.parseDouble(m.get("minFitness").toString());
            i++;
        }
        Plot2DPanel plot = new Plot2DPanel();
        plot.addLinePlot("Max fitness", Color.RED, maxfitnessplot);
        plot.addLinePlot("Average fitness", Color.ORANGE, avgfitnessplot);
        plot.addLinePlot("Standard deviation", Color.BLACK, stdDev);
        plot.addLegend("SOUTH");
        BaseLabel title = new BaseLabel(problemBox.getSelectedItem().toString() + ", " + 
                adultBox.getSelectedItem().toString() + ", " + 
                parentBox.getSelectedItem().toString() + ", mutation: " + 
                mutationRateField.getText() + "%, crossover: " + crossoverRateField.getText() + "%"
                , Color.BLACK, 0.5, 1.1);
        plot.addPlotable(title);
        graphpanel.add(plot);
        Plot2DPanel plot2 = new Plot2DPanel();
        plot2.addLinePlot("Average entropy", Color.BLUE, avgEntropy);
        plot2.addLegend("SOUTH");
        BaseLabel title2 = new BaseLabel("Entropy graph: " + 
                problemBox.getSelectedItem().toString() + ", " + 
                adultBox.getSelectedItem().toString() + ", " + 
                parentBox.getSelectedItem().toString() + ", mutation: " + 
                mutationRateField.getText() + "%, crossover: " + 
                crossoverRateField.getText() + "%"
                , Color.BLACK, 0.5, 1.1);
        plot2.addPlotable(title2);
        graphpanel.add(plot2);
        CardLayout card = (CardLayout) graphpanel.getLayout();
        card.last(graphpanel);
        outputScreen.setText(formattedString);
    }
    
    private void runSpikingProblem(Evolution evo){
        outputScreen.setText("");
        int populationSize = Integer.parseInt(populationSizeField.getText());
        int generations = Integer.parseInt(generationsField.getText());
        SpikingNeuron sn = (SpikingNeuron) problem;
        List<IIndividual> individuals = problem.createPopulation(populationSize);
        try {
            for (int i = 0; i < generations; i++){
                individuals = evo.runGeneration(individuals);
                IIndividual best = individuals.get(0);
                for (IIndividual ind: individuals){
                    if(ind.age() > 0){
                        if (ind.fitness() > best.fitness()){
                            best = ind;
                        }
                    }
                }
                String formattedString = outputScreen.getText();
                formattedString += best.fitness()+ "\n";
                outputScreen.setText(formattedString);
                Plot2DPanel plot = new Plot2DPanel();
                BaseLabel title = new BaseLabel("Generation: " + (i+1) + 
                        problemBox.getSelectedItem().toString() + ", " + 
                        adultBox.getSelectedItem().toString() + ", " + 
                        parentBox.getSelectedItem().toString() + ", mutation: " + 
                        mutationRateField.getText() + "%, crossover: " + crossoverRateField.getText() + "%"
                        , Color.BLACK, 0.5, 1.1);
                plot.addPlotable(title);
                plot.addLinePlot("Target", Color.RED, sn.target);
                String[] bestValuesString = best.phenotype().toString().trim().split(" ");
                double[] bestValues = new double[bestValuesString.length];
                for (int j = 0; j < bestValues.length; j++){
                    bestValues[j] = Double.parseDouble(bestValuesString[j]);
                }
                plot.addLinePlot("Best individual", Color.BLUE, bestValues);
                plot.addLegend("SOUTH");
                graphpanel.add(plot);
                CardLayout card = (CardLayout) graphpanel.getLayout();
                card.last(graphpanel);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CardLayout card = (CardLayout) graphpanel.getLayout();
        card.last(graphpanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nextGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextGraphActionPerformed
        CardLayout card = (CardLayout) graphpanel.getLayout();
        card.next(graphpanel);
    }//GEN-LAST:event_nextGraphActionPerformed

    private void previousGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousGraphActionPerformed
        CardLayout card = (CardLayout) graphpanel.getLayout();
        card.previous(graphpanel);
    }//GEN-LAST:event_previousGraphActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        graphpanel.removeAll();
        outputScreen.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EvoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvoGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adultBox;
    private javax.swing.JPanel adultPanel;
    private javax.swing.JButton clearButton;
    public javax.swing.JTextField crossoverRateField;
    private javax.swing.JSlider crossoverSplitSlider;
    public javax.swing.JTextField generationsField;
    private javax.swing.JPanel graphpanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton launchButton;
    public javax.swing.JTextField mutationRateField;
    private javax.swing.JButton nextGraph;
    private javax.swing.JTextArea outputScreen;
    private javax.swing.JComboBox parentBox;
    private javax.swing.JPanel parentPane;
    private javax.swing.JTextField populationSizeField;
    private javax.swing.JButton previousGraph;
    private javax.swing.JComboBox problemBox;
    private javax.swing.JPanel problemPane;
    // End of variables declaration//GEN-END:variables
}

class StandardDeviation
{

    public static double StandardDeviationMean ( double[] data )
    {
        // sd is sqrt of sum of (values-mean) squared divided by n - 1
        // Calculate the mean
        double mean = 0;
        final int n = data.length;
        if ( n < 2 )
        {
        return Double.NaN;
        }
        for ( int i=0; i<n; i++ )
        {
        mean += data[i];
        }
        mean /= n;
        // calculate the sum of squares
        double sum = 0;
        for ( int i=0; i<n; i++ )
        {
        final double v = data[i] - mean;
        sum += v * v;
        }
        // Change to ( n - 1 ) to n if you have complete data instead of a sample.
        return Math.sqrt( sum / ( n - 1 ) );
    }

    public static double standardDeviationCalculate ( double[] data )
    {
        final int n = data.length;
        if ( n < 2 )
        {
            return Double.NaN;
        }
        double avg = data[0];
        double sum = 0;
        for ( int i = 1; i < data.length; i++ )
        {
            double newavg = avg + ( data[i] - avg ) / ( i + 1 );
            sum += ( data[i] - avg ) * ( data [i] -newavg ) ;
            avg = newavg;
        }
        // Change to ( n - 1 ) to n if you have complete data instead of a sample.
        return Math.sqrt( sum / ( n ) );
    }
}