/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.text.View;
/**
 *
 * @author Daniel
 */
public class AdminPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form AdminPrincipal
     */
    public AdminPrincipal() {
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // FEchar somente uma tela, não o programa todo
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        jPanelAdminPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivos = new javax.swing.JMenu();
        jMenuSubConfig = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuSubBackup = new javax.swing.JMenuItem();
        jMenuSubImportFunc = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuSubLogs = new javax.swing.JMenu();
        jMenuSubSair = new javax.swing.JMenuItem();
        jMenuFuncionario = new javax.swing.JMenu();
        menu_visualizar_funcionarios = new javax.swing.JMenuItem();
        menu_cadastrar_funcionarios = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuSubRelatorioFuncionarios = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuSubRelatorioControleHoras = new javax.swing.JMenuItem();
        jMenuSubRelatorioBancoHoras = new javax.swing.JMenuItem();
        jMenuSubRelatorioHorarios = new javax.swing.JMenuItem();
        jMenuSubRelatorioControleAtividades = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuSubRelatorioControleAdmin = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSubDuvidas = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuSubAtualizacao = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuSubDadosSistema = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuSubSobre = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel do Administrador");

        jPanelAdminPrincipal.setName("Batedor de Ponto"); // NOI18N

        javax.swing.GroupLayout jPanelAdminPrincipalLayout = new javax.swing.GroupLayout(jPanelAdminPrincipal);
        jPanelAdminPrincipal.setLayout(jPanelAdminPrincipalLayout);
        jPanelAdminPrincipalLayout.setHorizontalGroup(
            jPanelAdminPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanelAdminPrincipalLayout.setVerticalGroup(
            jPanelAdminPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuArquivos.setText("Arquivos");

        jMenuSubConfig.setText("Configurações");
        jMenuArquivos.add(jMenuSubConfig);
        jMenuArquivos.add(jSeparator1);

        jMenuSubBackup.setText("Backup");
        jMenuArquivos.add(jMenuSubBackup);

        jMenuSubImportFunc.setText("Importar Funcionarios");
        jMenuArquivos.add(jMenuSubImportFunc);
        jMenuArquivos.add(jSeparator6);

        jMenuSubLogs.setText("Logs do Sistema");
        jMenuArquivos.add(jMenuSubLogs);

        jMenuSubSair.setText("Sair");
        jMenuSubSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSubSairActionPerformed(evt);
            }
        });
        jMenuArquivos.add(jMenuSubSair);

        jMenuBar1.add(jMenuArquivos);

        jMenuFuncionario.setText("Funcionários");

        menu_visualizar_funcionarios.setText("Visualizar");
        menu_visualizar_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_visualizar_funcionariosActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(menu_visualizar_funcionarios);

        menu_cadastrar_funcionarios.setText("Cadastrar");
        menu_cadastrar_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrar_funcionariosActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(menu_cadastrar_funcionarios);

        jMenuBar1.add(jMenuFuncionario);

        jMenuRelatorio.setText("Relatórios");

        jMenuSubRelatorioFuncionarios.setText("Funcionarios");
        jMenuRelatorio.add(jMenuSubRelatorioFuncionarios);
        jMenuRelatorio.add(jSeparator3);

        jMenuSubRelatorioControleHoras.setText("Controle de Horas");
        jMenuRelatorio.add(jMenuSubRelatorioControleHoras);

        jMenuSubRelatorioBancoHoras.setText("Banco de Horas");
        jMenuRelatorio.add(jMenuSubRelatorioBancoHoras);

        jMenuSubRelatorioHorarios.setText("Horários");
        jMenuRelatorio.add(jMenuSubRelatorioHorarios);

        jMenuSubRelatorioControleAtividades.setText("Controle de Atividades");
        jMenuRelatorio.add(jMenuSubRelatorioControleAtividades);
        jMenuRelatorio.add(jSeparator5);

        jMenuSubRelatorioControleAdmin.setText("Controle Administrativo");
        jMenuRelatorio.add(jMenuSubRelatorioControleAdmin);

        jMenuBar1.add(jMenuRelatorio);

        jMenuAjuda.setText("Ajuda");

        jMenuSubDuvidas.setText("Dúvidas sobre o sistema");
        jMenuAjuda.add(jMenuSubDuvidas);
        jMenuAjuda.add(jSeparator9);

        jMenuSubAtualizacao.setText("Verificar Atualização");
        jMenuAjuda.add(jMenuSubAtualizacao);
        jMenuAjuda.add(jSeparator8);

        jMenuSubDadosSistema.setText("Dados do Sistema");
        jMenuAjuda.add(jMenuSubDadosSistema);
        jMenuAjuda.add(jSeparator7);

        jMenuSubSobre.setText("Sobre o Software");
        jMenuAjuda.add(jMenuSubSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAdminPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAdminPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSubSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSubSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuSubSairActionPerformed

    private void menu_visualizar_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_visualizar_funcionariosActionPerformed
        
        
    }//GEN-LAST:event_menu_visualizar_funcionariosActionPerformed

    private void menu_cadastrar_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrar_funcionariosActionPerformed
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_menu_cadastrar_funcionariosActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem jMenuSubAtualizacao;
    private javax.swing.JMenuItem jMenuSubBackup;
    private javax.swing.JMenuItem jMenuSubConfig;
    private javax.swing.JMenuItem jMenuSubDadosSistema;
    private javax.swing.JMenuItem jMenuSubDuvidas;
    private javax.swing.JMenuItem jMenuSubImportFunc;
    private javax.swing.JMenu jMenuSubLogs;
    private javax.swing.JMenuItem jMenuSubRelatorioBancoHoras;
    private javax.swing.JMenuItem jMenuSubRelatorioControleAdmin;
    private javax.swing.JMenuItem jMenuSubRelatorioControleAtividades;
    private javax.swing.JMenuItem jMenuSubRelatorioControleHoras;
    private javax.swing.JMenuItem jMenuSubRelatorioFuncionarios;
    private javax.swing.JMenuItem jMenuSubRelatorioHorarios;
    private javax.swing.JMenuItem jMenuSubSair;
    private javax.swing.JMenu jMenuSubSobre;
    private javax.swing.JPanel jPanelAdminPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem menu_cadastrar_funcionarios;
    private javax.swing.JMenuItem menu_visualizar_funcionarios;
    // End of variables declaration//GEN-END:variables
}
