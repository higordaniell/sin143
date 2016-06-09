/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spej.view;

import com.spej.controller.UsuarioController;
import com.spej.model.Departamento;
import com.spej.model.DepartamentoComboBoxModel;
import com.spej.model.Usuario;
import java.awt.Dialog;

/**
 *
 * @author Higor
 */
public class CadastrarUsuario extends javax.swing.JDialog {

    /**
     * Creates new form CadastroFuncionario
     */
    public CadastrarUsuario() {
        initComponents();
        setLocationRelativeTo( null ); // Centralizar a tela no meio
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelTela = new javax.swing.JPanel();
        jTextMatricula = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabeNomeCompleto = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelCadastroFuncionarioTitulo = new javax.swing.JLabel();
        jLabelMatricula1 = new javax.swing.JLabel();
        jTextData = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextCargo = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jLabelDepartamento = new javax.swing.JLabel();
        jComboDepartamento = new javax.swing.JComboBox<DepartamentoComboBoxModel>();
        jBotaoAcao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setModal(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        JPanelTela.setBackground(new java.awt.Color(238, 238, 238));

        jTextMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatriculaActionPerformed(evt);
            }
        });

        jLabelDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDataNascimento.setText("Data de nascimento");

        jLabeNomeCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeNomeCompleto.setText("Nome completo");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jLabelCadastroFuncionarioTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCadastroFuncionarioTitulo.setText("Cadastro de Usuário");

        jLabelMatricula1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMatricula1.setText("Matricula");

        jTextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataActionPerformed(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEmail.setText("Email");

        jTextCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCargoActionPerformed(evt);
            }
        });

        jLabelCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCargo.setText("Cargo");

        jLabelDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDepartamento.setText("Departamento");

        jComboDepartamento.setModel(new com.spej.model.DepartamentoComboBoxModel());
        jComboDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDepartamentoActionPerformed(evt);
            }
        });

        jBotaoAcao.setText("Cadastrar");
        jBotaoAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoAcaoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/foto.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout JPanelTelaLayout = new javax.swing.GroupLayout(JPanelTela);
        JPanelTela.setLayout(JPanelTelaLayout);
        JPanelTelaLayout.setHorizontalGroup(
            JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelTelaLayout.createSequentialGroup()
                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBotaoAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelTelaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMatricula1))
                                .addGap(30, 30, 30)
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                                        .addComponent(jLabeNomeCompleto)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextNome)))
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataNascimento)
                                    .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jTextEmail)))
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCargo)
                                    .addComponent(jTextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                                        .addComponent(jLabelDepartamento)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelTelaLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabelCadastroFuncionarioTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        JPanelTelaLayout.setVerticalGroup(
            JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTelaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelCadastroFuncionarioTitulo)
                .addGap(47, 47, 47)
                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelTelaLayout.createSequentialGroup()
                        .addComponent(jLabelMatricula1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addComponent(jLabelDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCargo)
                            .addComponent(jLabelDepartamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelTelaLayout.createSequentialGroup()
                        .addComponent(jLabeNomeCompleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jBotaoAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMatriculaActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCargoActionPerformed

    private void jComboDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDepartamentoActionPerformed

    private void jBotaoAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoAcaoActionPerformed
        
        Usuario usuario = new Usuario();
        UsuarioController uc = new UsuarioController(usuario);
        
        usuario.setMatricula( Integer.getInteger(jTextMatricula.getText()) );
        usuario.setNome( jTextNome.getText() );
        usuario.setCargo( jTextNome.getText() );
        //usuario.setDepartamento( jComboDepartamento.getSelectedObjects() );
        
        uc.insert();
    }//GEN-LAST:event_jBotaoAcaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelTela;
    private javax.swing.JButton jBotaoAcao;
    private javax.swing.JComboBox<DepartamentoComboBoxModel> jComboDepartamento;
    private javax.swing.JLabel jLabeNomeCompleto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadastroFuncionarioTitulo;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMatricula1;
    private javax.swing.JTextField jTextCargo;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
