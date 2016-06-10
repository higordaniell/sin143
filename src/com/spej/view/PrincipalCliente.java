/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spej.view;

import com.spej.controller.PontoController;
import com.spej.controller.UsuarioController;

/**
 *
 * @author Daniel
 */
public class PrincipalCliente extends javax.swing.JFrame {
    
    private UsuarioController userC;
    private PontoController pontoC;

    /**
     * Creates new form PrincipalCliente
     */
    public PrincipalCliente() {
        initComponents();
        setLocationRelativeTo( null ); // Centralizar a tela no meio       
        
        userC = new UsuarioController();
        pontoC = new PontoController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelPrincipalClientes = new javax.swing.JPanel();
        JLabelLogo = new javax.swing.JLabel();
        jCaixaIdentificacao = new javax.swing.JTextField();
        JBaterPonto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 238, 238));
        setResizable(false);

        jPainelPrincipalClientes.setBackground(new java.awt.Color(238, 238, 238));
        jPainelPrincipalClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPainelPrincipalClientes.setMaximumSize(null);
        jPainelPrincipalClientes.setPreferredSize(new java.awt.Dimension(780, 474));

        JLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/logo.png"))); // NOI18N

        jCaixaIdentificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCaixaIdentificacaoActionPerformed(evt);
            }
        });

        JBaterPonto.setText("Bater Ponto");
        JBaterPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBaterPontoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matrícula", "Nome", "Horário"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Administração");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPainelPrincipalClientesLayout = new javax.swing.GroupLayout(jPainelPrincipalClientes);
        jPainelPrincipalClientes.setLayout(jPainelPrincipalClientesLayout);
        jPainelPrincipalClientesLayout.setHorizontalGroup(
            jPainelPrincipalClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelPrincipalClientesLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(jPainelPrincipalClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPainelPrincipalClientesLayout.createSequentialGroup()
                        .addGroup(jPainelPrincipalClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabelLogo)
                            .addComponent(jCaixaIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JBaterPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(128, 128, 128))
        );
        jPainelPrincipalClientesLayout.setVerticalGroup(
            jPainelPrincipalClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelPrincipalClientesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPainelPrincipalClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCaixaIdentificacao)
                    .addComponent(JBaterPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipalClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelPrincipalClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBaterPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBaterPontoActionPerformed
        try {
            pontoC.baterPonto( Integer.parseInt(jCaixaIdentificacao.getText()) );
        }
        catch(NumberFormatException e) {
            Mensagem.erro(this, "Matricula inválida!");
        }
        catch(RuntimeException e) {
            Mensagem.erro(this, e.getMessage(), "Falha ao bater bonto");
        }
        catch(Exception e) {
            Mensagem.erro(this, "Erro desconhecido!\n" + e.getMessage(), "Falha ao bater bonto");
        }
    }//GEN-LAST:event_JBaterPontoActionPerformed

    private void jCaixaIdentificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCaixaIdentificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCaixaIdentificacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login login = new Login();
        login.setVisible(true);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBaterPonto;
    private javax.swing.JLabel JLabelLogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCaixaIdentificacao;
    private javax.swing.JPanel jPainelPrincipalClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
