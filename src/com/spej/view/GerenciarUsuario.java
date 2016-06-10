/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spej.view;

import com.spej.controller.PontoController;
import java.awt.Color;
import java.awt.Dialog;

/**
 *
 * @author Daniel
 */
public class GerenciarUsuario extends javax.swing.JDialog {

    /**
     * Creates new form GerenciarUsuario
     */
    public GerenciarUsuario() {
        initComponents();
        setLocationRelativeTo( null ); // Centralizar a tela no meio
        getContentPane().setBackground(new Color(238,238,238));
        setar();
    }
    
    public void setar(){
        jBotaoEditar.setEnabled(false);
        jBotaoExcluir.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGerenciarUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextMatricula = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTb1 = new javax.swing.JScrollPane();
        jTb = new javax.swing.JTable();
        jBotaoEditar = new javax.swing.JButton();
        jBotaoExcluir = new javax.swing.JButton();
        jBotaoBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(238, 238, 238));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanelGerenciarUsuario.setBackground(new java.awt.Color(238, 238, 238));
        jPanelGerenciarUsuario.setToolTipText("Gerenciar Usuários");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gerenciar Usuários");

        jTextMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMatriculaActionPerformed(evt);
            }
        });

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Matricula");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome");

        jTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jTb1.setViewportView(jTb);

        jBotaoEditar.setText("Editar");
        jBotaoEditar.setEnabled(false);

        jBotaoExcluir.setText("Excluir");
        jBotaoExcluir.setEnabled(false);

        jBotaoBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanelGerenciarUsuarioLayout = new javax.swing.GroupLayout(jPanelGerenciarUsuario);
        jPanelGerenciarUsuario.setLayout(jPanelGerenciarUsuarioLayout);
        jPanelGerenciarUsuarioLayout.setHorizontalGroup(
            jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerenciarUsuarioLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGerenciarUsuarioLayout.createSequentialGroup()
                        .addComponent(jBotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGerenciarUsuarioLayout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(221, 221, 221))
                    .addGroup(jPanelGerenciarUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanelGerenciarUsuarioLayout.createSequentialGroup()
                                .addGroup(jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUsuario)
                                    .addComponent(jTextMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNome)
                                    .addGroup(jPanelGerenciarUsuarioLayout.createSequentialGroup()
                                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBotaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelGerenciarUsuarioLayout.setVerticalGroup(
            jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGerenciarUsuarioLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBotaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextMatricula)
                    .addComponent(jTextNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTb1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelGerenciarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGerenciarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGerenciarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelGerenciarUsuario.getAccessibleContext().setAccessibleName("");
        jPanelGerenciarUsuario.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoBuscar;
    private javax.swing.JButton jBotaoEditar;
    private javax.swing.JButton jBotaoExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelGerenciarUsuario;
    private javax.swing.JTable jTb;
    private javax.swing.JScrollPane jTb1;
    private javax.swing.JTextField jTextMatricula;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
