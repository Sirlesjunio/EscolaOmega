/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EnsinoRegular;

/**
 *
 * @author Sirles Junio
 */
public class Passei_de_Ano extends javax.swing.JDialog {

    /**
     * Creates new form Form
     */
    public Passei_de_Ano(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
 regenerated by the Passei_de_Ano Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nota3Bim = new javax.swing.JTextField();
        nota4Bim = new javax.swing.JTextField();
        btCalcula = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nota1Bim = new javax.swing.JTextField();
        nota2Bim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Nota 2º Bim");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Digite suas notas abaixo:");

        nota3Bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota3BimActionPerformed(evt);
            }
        });

        nota4Bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota4BimActionPerformed(evt);
            }
        });

        btCalcula.setText("Calcular");
        btCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculaActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblResultado.setText("Resultado");

        jLabel1.setText("Nota 4º Bim");

        jLabel2.setText("Nota 3º Bim");

        nota1Bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1BimActionPerformed(evt);
            }
        });

        nota2Bim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota2BimActionPerformed(evt);
            }
        });

        jLabel3.setText("Nota 1º Bim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btCalcula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nota4Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(55, 55, 55)
                        .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(55, 55, 55)
                        .addComponent(nota2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nota3Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota1Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota2Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota3Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota4Bim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nota3BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota3BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota3BimActionPerformed

    private void nota4BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota4BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota4BimActionPerformed

    private void btCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculaActionPerformed
        totemomega_xp.EnsinoRegular ensinoRegular = new totemomega_xp.EnsinoRegular();
        ensinoRegular.setBimestre1(Double.parseDouble(nota1Bim.getText()));
        ensinoRegular.setBimestre2(Double.parseDouble(nota2Bim.getText()));
        ensinoRegular.setBimestre3(Double.parseDouble(nota3Bim.getText()));
        ensinoRegular.setBimestre4(Double.parseDouble(nota4Bim.getText()));
        ensinoRegular.media();
        if(ensinoRegular.media() > 10){
            if(ensinoRegular.media() >= 70){
                lblResultado.setText(Double.toString(ensinoRegular.media()) + " Aprovado");
            } else
            lblResultado.setText(Double.toString(ensinoRegular.media()) + " Exame");
        } else if(ensinoRegular.media() >= 7){
            lblResultado.setText(Double.toString(ensinoRegular.media()) + " Aprovado");
        } else
        lblResultado.setText(Double.toString(ensinoRegular.media()) + " Exame");
    }//GEN-LAST:event_btCalculaActionPerformed

    private void nota1BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota1BimActionPerformed

    private void nota2BimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota2BimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nota2BimActionPerformed

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
            java.util.logging.Logger.getLogger(Passei_de_Ano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passei_de_Ano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passei_de_Ano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passei_de_Ano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Passei_de_Ano dialog = new Passei_de_Ano(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField nota1Bim;
    private javax.swing.JTextField nota2Bim;
    private javax.swing.JTextField nota3Bim;
    private javax.swing.JTextField nota4Bim;
    // End of variables declaration//GEN-END:variables
}
