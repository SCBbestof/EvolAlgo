/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Odd
 */
public class ProblemMaxOne extends javax.swing.JPanel {

    /**
     * Creates new form ProblemMaxOne
     */
    public ProblemMaxOne() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bitSizeButton = new javax.swing.JRadioButton();
        bitInputButton = new javax.swing.JRadioButton();
        maxOneSizeField = new javax.swing.JTextField();
        maxOneManualField = new javax.swing.JTextField();

        bitSizeButton.setSelected(true);
        bitSizeButton.setText("Bit string size");
        bitSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitSizeButtonActionPerformed(evt);
            }
        });

        bitInputButton.setText("Manual input");
        bitInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitInputButtonActionPerformed(evt);
            }
        });

        maxOneSizeField.setText("40");

        maxOneManualField.setText("11111111111111111111");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bitSizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxOneSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bitInputButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxOneManualField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bitSizeButton)
                    .addComponent(maxOneSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bitInputButton)
                    .addComponent(maxOneManualField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bitSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitSizeButtonActionPerformed
        bitInputButton.setSelected(false);
    }//GEN-LAST:event_bitSizeButtonActionPerformed

    private void bitInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitInputButtonActionPerformed
        bitSizeButton.setSelected(false);
    }//GEN-LAST:event_bitInputButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bitInputButton;
    private javax.swing.JRadioButton bitSizeButton;
    private javax.swing.JTextField maxOneManualField;
    private javax.swing.JTextField maxOneSizeField;
    // End of variables declaration//GEN-END:variables
}
