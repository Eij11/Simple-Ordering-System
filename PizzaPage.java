
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author eljon
 */
public class PizzaPage extends javax.swing.JFrame {

    /**
     * Creates new form PizzaPage
     */
    public PizzaPage() {
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

        jCheckBox_PM = new javax.swing.JCheckBox();
        jCheckBox_PS = new javax.swing.JCheckBox();
        jCheckBox_PL = new javax.swing.JCheckBox();
        jCheckBox_PXL = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order a Pizza");

        jCheckBox_PM.setText("Pizza Medium");
        jCheckBox_PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_PMActionPerformed(evt);
            }
        });

        jCheckBox_PS.setText("Pizza Small");

        jCheckBox_PL.setText("Pizza Large");
        jCheckBox_PL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_PLActionPerformed(evt);
            }
        });

        jCheckBox_PXL.setText("Pizza X-Large");
        jCheckBox_PXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_PXLActionPerformed(evt);
            }
        });

        jLabel1.setText("3$");

        jLabel2.setText("5$");

        jLabel3.setText("10$");

        jLabel4.setText("7$");

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox_PXL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox_PL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCheckBox_PM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCheckBox_PS)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_PS)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_PM)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_PL)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox_PXL)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(299, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox_PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_PMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_PMActionPerformed

    private void jCheckBox_PLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_PLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_PLActionPerformed

    private void jCheckBox_PXLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_PXLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_PXLActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int total = 0;
        if(jCheckBox_PS.isSelected()){
            total += 3;
        }
        if(jCheckBox_PM.isSelected()){
            total += 5;
        }
        if(jCheckBox_PL.isSelected()){
            total += 7;
        }
        if(jCheckBox_PXL.isSelected()){
            total += 10;
        }
        JOptionPane.showConfirmDialog(rootPane, "Total: " + total, "Cost", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        
        AskAgain again = new AskAgain();
        again.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox_PL;
    private javax.swing.JCheckBox jCheckBox_PM;
    private javax.swing.JCheckBox jCheckBox_PS;
    private javax.swing.JCheckBox jCheckBox_PXL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
