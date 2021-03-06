/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spej.view;

import com.spej.controller.RelatorioController;
import com.spej.controller.RelatorioController.Relatorios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.text.MaskFormatter;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Tela para acesso aos relatórios do sistema
 * @author Daniel
 */
public class RelatoriosView extends javax.swing.JDialog {
   
    private RelatorioController rc;
        
    /**
     * Creates new form FiltroRelatorioPresencaUsuario
     * @param parent
     * @param modal
     */
    public RelatoriosView(java.awt.Frame parent, boolean modal) {        
        super(parent, modal);
        
        rc = new RelatorioController();
        
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

        jPanel = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUsuarios = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jSelecionarTudoUsuario = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jBotaoPresenca = new javax.swing.JButton();
        jBotaoAtividades = new javax.swing.JButton();
        jBotaoCompleto = new javax.swing.JButton();
        jPanelDepartamento = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListDepartamentos = new javax.swing.JList();
        jSelecionarTudoDepartamento = new javax.swing.JButton();
        jPanelDatas = new javax.swing.JPanel();
        jLabelInicial = new javax.swing.JLabel();
        jLabelFinal = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        MaskFormatter maskData = null;
        try {
            maskData = new MaskFormatter("##/##/####");
            maskData.setPlaceholderCharacter('_');
        } catch(ParseException e) {
        }
        jDataInicial = new javax.swing.JFormattedTextField(maskData);
        jDataFinal = new javax.swing.JFormattedTextField(maskData);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios do Sistema");
        setPreferredSize(new java.awt.Dimension(480, 545));
        setType(java.awt.Window.Type.UTILITY);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitulo.setText("Relatórios do Sistema");

        jListUsuarios.setModel(new com.spej.model.UsuarioListModel());
        jScrollPane1.setViewportView(jListUsuarios);

        jLabel1.setText("Usuário");

        jSelecionarTudoUsuario.setText("Selecionar Tudo");
        jSelecionarTudoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelecionarTudoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSelecionarTudoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSelecionarTudoUsuario))
        );

        jBotaoPresenca.setText("Relatório Presença");
        jBotaoPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoPresencaActionPerformed(evt);
            }
        });

        jBotaoAtividades.setText("Relatório Atividades");
        jBotaoAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoAtividadesActionPerformed(evt);
            }
        });

        jBotaoCompleto.setText("Relatório Completo");
        jBotaoCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoCompletoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addComponent(jBotaoPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotaoAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotaoCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoPresenca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelDepartamento.setPreferredSize(new java.awt.Dimension(211, 247));

        jLabel5.setText("Departamento");

        jListDepartamentos.setModel(new com.spej.model.DepartamentoListModel());
        jScrollPane4.setViewportView(jListDepartamentos);

        jSelecionarTudoDepartamento.setText("Selecionar Tudo");
        jSelecionarTudoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelecionarTudoDepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDepartamentoLayout = new javax.swing.GroupLayout(jPanelDepartamento);
        jPanelDepartamento.setLayout(jPanelDepartamentoLayout);
        jPanelDepartamentoLayout.setHorizontalGroup(
            jPanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepartamentoLayout.createSequentialGroup()
                .addGroup(jPanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanelDepartamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addComponent(jSelecionarTudoDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDepartamentoLayout.setVerticalGroup(
            jPanelDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepartamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSelecionarTudoDepartamento))
        );

        jPanelDatas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabelInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelInicial.setText("Data Inicial");

        jLabelFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFinal.setText("Data Final");

        jLabelPeriodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPeriodo.setText("Período de filtragem:");

        //jDataInicial.setText( new SimpleDateFormat("dd/MM/yyyy").format( Calendar.getInstance().getTime().getTime() ) );

        jDataFinal.setText( new SimpleDateFormat("dd/MM/yyyy").format( Calendar.getInstance().getTime().getTime() ) );

        javax.swing.GroupLayout jPanelDatasLayout = new javax.swing.GroupLayout(jPanelDatas);
        jPanelDatas.setLayout(jPanelDatasLayout);
        jPanelDatasLayout.setHorizontalGroup(
            jPanelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatasLayout.createSequentialGroup()
                        .addGroup(jPanelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInicial)
                            .addComponent(jDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatasLayout.createSequentialGroup()
                                .addComponent(jLabelFinal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelDatasLayout.createSequentialGroup()
                                .addComponent(jDataFinal)
                                .addContainerGap())))
                    .addGroup(jPanelDatasLayout.createSequentialGroup()
                        .addComponent(jLabelPeriodo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelDatasLayout.setVerticalGroup(
            jPanelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPeriodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInicial)
                    .addComponent(jLabelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDatas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(22, 22, 22)
                .addComponent(jPanelDatas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoAtividadesActionPerformed
        this.makeRelatorio(Relatorios.ATIVIDADE);
    }//GEN-LAST:event_jBotaoAtividadesActionPerformed

    private void jBotaoCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoCompletoActionPerformed
        this.makeRelatorio(Relatorios.COMPLETO);
    }//GEN-LAST:event_jBotaoCompletoActionPerformed

    private void jBotaoPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoPresencaActionPerformed
        this.makeRelatorio(Relatorios.PRESENCA);
    }//GEN-LAST:event_jBotaoPresencaActionPerformed

    private void jSelecionarTudoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelecionarTudoUsuarioActionPerformed
        jListUsuarios.setSelectionInterval(0, jListUsuarios.getModel().getSize() - 1 );
    }//GEN-LAST:event_jSelecionarTudoUsuarioActionPerformed

    private void jSelecionarTudoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelecionarTudoDepartamentoActionPerformed
        jListDepartamentos.setSelectionInterval(0, jListDepartamentos.getModel().getSize() - 1 );
    }//GEN-LAST:event_jSelecionarTudoDepartamentoActionPerformed

    
    private void makeRelatorio(Relatorios relatorio) {
        
        if(jListUsuarios.getSelectedValuesList().isEmpty()) {
            Mensagem.aviso(this, "Selecione ao menos um usuário");
            return;
        } 
        else if( jListDepartamentos.getSelectedValuesList().isEmpty() ) {
            Mensagem.aviso(this, "Selecione ao menos um departamento");
            return;
        }
        
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");    
        
        try {
            
            JasperViewer jv = rc.relatorio(
                relatorio,
                jListUsuarios.getSelectedValuesList(), 
                jListDepartamentos.getSelectedValuesList(),
                new java.sql.Date(DATE_FORMAT.parse(jDataInicial.getText()).getTime()),
                new java.sql.Date(DATE_FORMAT.parse(jDataFinal.getText()).getTime())
            );             
            
            this.setVisible(false);
        
            jv.setVisible(true);
            jv.toFront();        
        } 
        catch(ParseException e) {
            Mensagem.erro(this, "Data inválida!");
        }
        catch(Exception e) {
            Mensagem.erro(this, "Falha ao abrir relatório!\n" + e.getMessage());
        }         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoAtividades;
    private javax.swing.JButton jBotaoCompleto;
    private javax.swing.JButton jBotaoPresenca;
    private javax.swing.JFormattedTextField jDataFinal;
    private javax.swing.JFormattedTextField jDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFinal;
    private javax.swing.JLabel jLabelInicial;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList jListDepartamentos;
    private javax.swing.JList jListUsuarios;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDatas;
    private javax.swing.JPanel jPanelDepartamento;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jSelecionarTudoDepartamento;
    private javax.swing.JButton jSelecionarTudoUsuario;
    // End of variables declaration//GEN-END:variables
}
