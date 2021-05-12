/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controllers.PnlOrdinariaController;
import Panels.PnlOrdinaria;
import java.awt.BorderLayout;
import javax.swing.JComponent;

/**
 *
 * @author FAMILIASOZAORTIZ
 */
public class App extends javax.swing.JFrame {
    private PnlOrdinaria pnlOrdinaria;
    private PnlOrdinariaController pnlOrdinariaController;
    
    public App() {
        initComponents();
    }

    private void addCompoment(JComponent component){
        pnlContent.removeAll();
        pnlContent.add(component,BorderLayout.CENTER);
        validate();
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnOrdinaria = new javax.swing.JButton();
        btnAnticipada = new javax.swing.JButton();
        btnDiferida = new javax.swing.JButton();
        btnContinua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PnlBorder = new javax.swing.JPanel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(85, 300));
        jPanel1.setLayout(new java.awt.GridLayout(4, 0));

        btnOrdinaria.setText("Ordinaria");
        btnOrdinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdinariaActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdinaria);

        btnAnticipada.setText("Anticipada");
        jPanel1.add(btnAnticipada);

        btnDiferida.setText("Diferida");
        jPanel1.add(btnDiferida);

        btnContinua.setText("Continua");
        jPanel1.add(btnContinua);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(165, 225, 173));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculo de Anualidad");
        jPanel3.add(jLabel1);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        PnlBorder.setBackground(new java.awt.Color(250, 243, 243));
        PnlBorder.setPreferredSize(new java.awt.Dimension(380, 320));
        PnlBorder.setLayout(new java.awt.GridBagLayout());

        pnlContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlContent.setMinimumSize(new java.awt.Dimension(200, 200));
        pnlContent.setPreferredSize(new java.awt.Dimension(200, 200));
        pnlContent.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(19, 19, 19, 19);
        PnlBorder.add(pnlContent, gridBagConstraints);

        jPanel2.add(PnlBorder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdinariaActionPerformed
        if (pnlOrdinaria == null){
            pnlOrdinaria = new PnlOrdinaria();
            pnlOrdinariaController = new PnlOrdinariaController(pnlOrdinaria);
        }
        
        addCompoment(pnlOrdinaria);
    }//GEN-LAST:event_btnOrdinariaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlBorder;
    private javax.swing.JButton btnAnticipada;
    private javax.swing.JButton btnContinua;
    private javax.swing.JButton btnDiferida;
    private javax.swing.JButton btnOrdinaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
