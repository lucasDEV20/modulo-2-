/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import classe.numero.conplexo;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JOptionPane;

/**
 *
 * @author Computador
 */
public class tela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
        this.setLocationRelativeTo(null);
        jToggleButtonnovoadicao.setVisible(true);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaida = new javax.swing.JTextArea();
        jToggleButtonAdicao = new javax.swing.JToggleButton();
        jToggleButtonnovoadicao = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaSaida.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaSaida.setColumns(20);
        jTextAreaSaida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextAreaSaida.setForeground(new java.awt.Color(204, 0, 255));
        jTextAreaSaida.setRows(5);
        jTextAreaSaida.setToolTipText("");
        jTextAreaSaida.setAutoscrolls(false);
        jTextAreaSaida.setBorder(new javax.swing.border.MatteBorder(null));
        jTextAreaSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextAreaSaida);

        jToggleButtonAdicao.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButtonAdicao.setForeground(new java.awt.Color(153, 0, 0));
        jToggleButtonAdicao.setText("saida ");
        jToggleButtonAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAdicaoActionPerformed(evt);
            }
        });

        jToggleButtonnovoadicao.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButtonnovoadicao.setForeground(new java.awt.Color(153, 0, 0));
        jToggleButtonnovoadicao.setText("nova saida ");
        jToggleButtonnovoadicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonnovoadicaoActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButtonAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonnovoadicao, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonAdicao, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jToggleButtonnovoadicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAdicaoActionPerformed
        // TODO add your handling code here:
        try { //tentativa 

            conplexo x = new conplexo();
            x.set(10, 20);
//valores de x , y e w           
            String saida = "----------------------------\n"
                         + "valor de X = " + x.get() + "\n"
                         + "----------------------------\n";         
            conplexo y = new conplexo(15, 5);
                  saida +="----------------------------\n"
                        + "valor de y = " + y.get() + "\n"
                        + "----------------------------\n";
            
            conplexo w = new conplexo(x);
                   saida +="----------------------------\n"
                         + "valor de w = " + w.get() + "\n"
                         + "----------------------------\n";
            
                   // este try catch enprega as condiçoes do numero perfeito que 
                   //e empregado por tres valores , relacionafdos as classes criadas 
                   //mo pacote de classes , que e importada , e executa os cauculos la craidos 
            jTextAreaSaida.setText(saida);
        } catch (Exception ex) { //erro
            JOptionPane.showMessageDialog(rootPane, (ex.getMessage() == null) ? ex : ex.getMessage(), "Eita...", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jToggleButtonAdicaoActionPerformed

    private void jToggleButtonnovoadicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonnovoadicaoActionPerformed
        //este metodo vai limpar todo o campo e trazer um novo calculo
        //limpa o conteudo dos campos 
        jTextAreaSaida.setText("");
        //
    }//GEN-LAST:event_jToggleButtonnovoadicaoActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaSaida;
    private javax.swing.JToggleButton jToggleButtonAdicao;
    private javax.swing.JToggleButton jToggleButtonnovoadicao;
    // End of variables declaration//GEN-END:variables
}
