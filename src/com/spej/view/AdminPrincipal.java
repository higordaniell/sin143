/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spej.view;


/**
 * Tela principal do administrador, a primeira a aparecer após o login
 * @author Daniel
 */
public class AdminPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form AdminPrincipal
     */
    public AdminPrincipal() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        setLocationRelativeTo( null ); // Centralizar a tela no meio
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // FEchar somente uma tela, não o programa todo

        //getContentPane().setBackground(new Color(238,238,238));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBarraFerramentas = new javax.swing.JToolBar();
        jBotaoGerenciarUsuario = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jBotaoDepartamento = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jBotaoRelatorioUsuarios = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jBotaoRelatorios = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jHelp = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivos = new javax.swing.JMenu();
        jMenuSubSair = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuFuncionario = new javax.swing.JMenu();
        menuGerenciarFuncionario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuCadastrarFuncionario = new javax.swing.JMenuItem();
        jMenuDepartamentos = new javax.swing.JMenu();
        jMenuGerenciarDepartamentos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuSubRelatorioFuncionarios = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuSubRelatorios = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuSubSobreSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel do Administrador");

        jBarraFerramentas.setFloatable(false);
        jBarraFerramentas.setRollover(true);

        jBotaoGerenciarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/users.png"))); // NOI18N
        jBotaoGerenciarUsuario.setToolTipText("Gerenciar Usuário");
        jBotaoGerenciarUsuario.setFocusable(false);
        jBotaoGerenciarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotaoGerenciarUsuario.setMaximumSize(new java.awt.Dimension(60, 45));
        jBotaoGerenciarUsuario.setMinimumSize(new java.awt.Dimension(60, 45));
        jBotaoGerenciarUsuario.setPreferredSize(new java.awt.Dimension(60, 45));
        jBotaoGerenciarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotaoGerenciarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotaoGerenciarUsuarioMouseClicked(evt);
            }
        });
        jBotaoGerenciarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoGerenciarUsuarioActionPerformed(evt);
            }
        });
        jBarraFerramentas.add(jBotaoGerenciarUsuario);
        jBarraFerramentas.add(jSeparator11);

        jBotaoDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/usersDepartamento.png"))); // NOI18N
        jBotaoDepartamento.setToolTipText("Gerenciar Departamento");
        jBotaoDepartamento.setFocusable(false);
        jBotaoDepartamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotaoDepartamento.setMaximumSize(new java.awt.Dimension(60, 45));
        jBotaoDepartamento.setMinimumSize(new java.awt.Dimension(60, 45));
        jBotaoDepartamento.setPreferredSize(new java.awt.Dimension(60, 45));
        jBotaoDepartamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotaoDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotaoDepartamentoMouseClicked(evt);
            }
        });
        jBotaoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoDepartamentoActionPerformed(evt);
            }
        });
        jBarraFerramentas.add(jBotaoDepartamento);
        jBarraFerramentas.add(jSeparator5);

        jBotaoRelatorioUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/usersRelatorio.png"))); // NOI18N
        jBotaoRelatorioUsuarios.setToolTipText("Relatorio de Usuarios");
        jBotaoRelatorioUsuarios.setBorderPainted(false);
        jBotaoRelatorioUsuarios.setFocusable(false);
        jBotaoRelatorioUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotaoRelatorioUsuarios.setMaximumSize(new java.awt.Dimension(60, 45));
        jBotaoRelatorioUsuarios.setMinimumSize(new java.awt.Dimension(60, 45));
        jBotaoRelatorioUsuarios.setPreferredSize(new java.awt.Dimension(60, 45));
        jBotaoRelatorioUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotaoRelatorioUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotaoRelatorioUsuariosMouseClicked(evt);
            }
        });
        jBotaoRelatorioUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoRelatorioUsuariosActionPerformed(evt);
            }
        });
        jBarraFerramentas.add(jBotaoRelatorioUsuarios);
        jBarraFerramentas.add(jSeparator8);

        jBotaoRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/consultas.png"))); // NOI18N
        jBotaoRelatorios.setToolTipText("Relatorios do Sistema");
        jBotaoRelatorios.setBorderPainted(false);
        jBotaoRelatorios.setFocusable(false);
        jBotaoRelatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBotaoRelatorios.setMaximumSize(new java.awt.Dimension(60, 45));
        jBotaoRelatorios.setMinimumSize(new java.awt.Dimension(60, 45));
        jBotaoRelatorios.setPreferredSize(new java.awt.Dimension(60, 45));
        jBotaoRelatorios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBotaoRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotaoRelatoriosMouseClicked(evt);
            }
        });
        jBotaoRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoRelatoriosActionPerformed(evt);
            }
        });
        jBarraFerramentas.add(jBotaoRelatorios);
        jBarraFerramentas.add(jSeparator9);

        jHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/help.png"))); // NOI18N
        jHelp.setToolTipText("Sobre o SPEJ");
        jHelp.setBorderPainted(false);
        jHelp.setFocusable(false);
        jHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jHelp.setMaximumSize(new java.awt.Dimension(60, 45));
        jHelp.setMinimumSize(new java.awt.Dimension(60, 45));
        jHelp.setPreferredSize(new java.awt.Dimension(60, 45));
        jHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHelpMouseClicked(evt);
            }
        });
        jHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHelpActionPerformed(evt);
            }
        });
        jBarraFerramentas.add(jHelp);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuArquivos.setText("Arquivos");

        jMenuSubSair.setText("Sair");
        jMenuSubSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSubSairActionPerformed(evt);
            }
        });
        jMenuArquivos.add(jMenuSubSair);
        jMenuArquivos.add(jSeparator1);

        jMenuBar1.add(jMenuArquivos);

        jMenuFuncionario.setText("Usuários");

        menuGerenciarFuncionario.setText("Gerenciar Usuários");
        menuGerenciarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarFuncionarioActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(menuGerenciarFuncionario);
        jMenuFuncionario.add(jSeparator2);

        menuCadastrarFuncionario.setText("Cadastrar Usuário");
        menuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(menuCadastrarFuncionario);

        jMenuBar1.add(jMenuFuncionario);

        jMenuDepartamentos.setText("Departamentos");
        jMenuDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDepartamentosMouseClicked(evt);
            }
        });
        jMenuDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDepartamentosActionPerformed(evt);
            }
        });

        jMenuGerenciarDepartamentos.setText("Gerenciar Departamentos");
        jMenuGerenciarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarDepartamentosActionPerformed(evt);
            }
        });
        jMenuDepartamentos.add(jMenuGerenciarDepartamentos);
        jMenuDepartamentos.add(jSeparator3);

        jMenuBar1.add(jMenuDepartamentos);

        jMenuRelatorio.setText("Relatórios");

        jMenuSubRelatorioFuncionarios.setText("Usuários cadastrados");
        jMenuSubRelatorioFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSubRelatorioFuncionariosMouseClicked(evt);
            }
        });
        jMenuSubRelatorioFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSubRelatorioFuncionariosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuSubRelatorioFuncionarios);
        jMenuRelatorio.add(jSeparator4);

        jMenuSubRelatorios.setText("Outros relatórios");
        jMenuSubRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSubRelatoriosActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuSubRelatorios);

        jMenuBar1.add(jMenuRelatorio);

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.add(jSeparator7);

        jMenuSubSobreSistema.setText("Sobre o sistema");
        jMenuSubSobreSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSubSobreSistemaActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuSubSobreSistema);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jBarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSubSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSubSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuSubSairActionPerformed

    private void menuGerenciarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarFuncionarioActionPerformed
        new GerenciarUsuario().setVisible(true);        
    }//GEN-LAST:event_menuGerenciarFuncionarioActionPerformed

    private void menuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFuncionarioActionPerformed
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_menuCadastrarFuncionarioActionPerformed

    private void jBotaoRelatorioUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoRelatorioUsuariosActionPerformed
        
    }//GEN-LAST:event_jBotaoRelatorioUsuariosActionPerformed


    private void jMenuDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDepartamentosActionPerformed

    }//GEN-LAST:event_jMenuDepartamentosActionPerformed

    private void jMenuDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDepartamentosMouseClicked

    }//GEN-LAST:event_jMenuDepartamentosMouseClicked

    private void jBotaoGerenciarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotaoGerenciarUsuarioMouseClicked

    }//GEN-LAST:event_jBotaoGerenciarUsuarioMouseClicked

    private void jMenuSubRelatorioFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSubRelatorioFuncionariosMouseClicked
        
    }//GEN-LAST:event_jMenuSubRelatorioFuncionariosMouseClicked

    private void jMenuSubRelatorioFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSubRelatorioFuncionariosActionPerformed
        new RelatorioUsuarios(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuSubRelatorioFuncionariosActionPerformed

    private void jMenuSubRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSubRelatoriosActionPerformed
        new RelatoriosView(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuSubRelatoriosActionPerformed

    private void jMenuSubSobreSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSubSobreSistemaActionPerformed
        new SobreAjuda(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuSubSobreSistemaActionPerformed

    private void jBotaoDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotaoDepartamentoMouseClicked
        new GerenciarDepartamento(this, true).setVisible(true);
    }//GEN-LAST:event_jBotaoDepartamentoMouseClicked

    private void jHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHelpActionPerformed
        new SobreAjuda(this, true).setVisible(true);
    }//GEN-LAST:event_jHelpActionPerformed

    private void jHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHelpMouseClicked

    }//GEN-LAST:event_jHelpMouseClicked

    private void jBotaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoRelatoriosActionPerformed
        new RelatoriosView(this, true).setVisible(true);
    }//GEN-LAST:event_jBotaoRelatoriosActionPerformed

    private void jBotaoRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotaoRelatoriosMouseClicked
        //new FiltroRelatorioControleAtividades(this, true).setVisible(true);
    }//GEN-LAST:event_jBotaoRelatoriosMouseClicked

    private void jBotaoRelatorioUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotaoRelatorioUsuariosMouseClicked
        new RelatorioUsuarios(this, true).setVisible(true);
    }//GEN-LAST:event_jBotaoRelatorioUsuariosMouseClicked

    private void jBotaoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotaoDepartamentoActionPerformed

    private void jBotaoGerenciarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoGerenciarUsuarioActionPerformed
        new GerenciarUsuario().setVisible(true);
    }//GEN-LAST:event_jBotaoGerenciarUsuarioActionPerformed

    private void jMenuGerenciarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarDepartamentosActionPerformed
        new GerenciarDepartamento(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuGerenciarDepartamentosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jBarraFerramentas;
    private javax.swing.JButton jBotaoDepartamento;
    private javax.swing.JButton jBotaoGerenciarUsuario;
    private javax.swing.JButton jBotaoRelatorioUsuarios;
    private javax.swing.JButton jBotaoRelatorios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jHelp;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDepartamentos;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuGerenciarDepartamentos;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem jMenuSubRelatorioFuncionarios;
    private javax.swing.JMenuItem jMenuSubRelatorios;
    private javax.swing.JMenuItem jMenuSubSair;
    private javax.swing.JMenuItem jMenuSubSobreSistema;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JMenuItem menuCadastrarFuncionario;
    private javax.swing.JMenuItem menuGerenciarFuncionario;
    // End of variables declaration//GEN-END:variables
}
