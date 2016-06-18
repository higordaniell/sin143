/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spej.view;

import com.spej.controller.UsuarioController;
import com.spej.dao.DepartamentoDao;
import com.spej.model.Departamento;
import com.spej.model.DepartamentoComboBoxModel;
import com.spej.model.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Higor
 */
public class CadastrarUsuario extends javax.swing.JDialog {

    private Usuario user;
    private boolean criando;
    
    /**
     * Creates new form CadastroFuncionario
     */
    public CadastrarUsuario() {
        this( new Usuario() );
        this.criando = true;
    }
    public CadastrarUsuario(Usuario usuario) {
        
        this.criando = false;
        this.user = usuario;
 
        initComponents();
        setLocationRelativeTo( null ); // Centralizar a tela no meio    
        
        limparCampos();
    }
    
    //Limpa os campos após o cadastro
    public void limparCampos(){
        
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        String date;
        try {
            date = DATE_FORMAT.format( this.user.getNascimento().getTime() );
        } 
        catch (Exception e) {
            date = DATE_FORMAT.format( new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()) );
        }

        DepartamentoDao dd = new DepartamentoDao();
        Departamento d = dd.getById( this.user.getDepartamento() );
        
        jTextMatricula.setText( this.user.getMatricula() + "" );
        jTextNome.setText( this.user.getNome() );
        jDataNascimento.setText( date );
        jTextCargo.setText( this.user.getCargo() );
        jTextEmail.setText( this.user.getEmail() );
        jTextUsername.setText( this.user.getUsername() );
        jPasswordField1.setText( this.user.getPassword() );
        jComboDepartamento.getModel().setSelectedItem( d );    
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
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabeNomeCompleto = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelCadastroFuncionarioTitulo = new javax.swing.JLabel();
        jLabelMatricula1 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextCargo = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jLabelDepartamento = new javax.swing.JLabel();
        jComboDepartamento = new javax.swing.JComboBox<DepartamentoComboBoxModel>();
        jBotaoAcao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jLabelUsuario1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        MaskFormatter maskData = null;
        try {
            maskData = new MaskFormatter("##/##/####");
            maskData.setPlaceholderCharacter('_');
        } catch(ParseException e) {
        }
        jDataNascimento = new javax.swing.JFormattedTextField(maskData);
        jTextMatricula = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setModal(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        JPanelTela.setBackground(new java.awt.Color(238, 238, 238));

        jLabelDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDataNascimento.setText("Data de nascimento");

        jLabeNomeCompleto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeNomeCompleto.setText("Nome completo");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });
        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNomeKeyTyped(evt);
            }
        });

        jLabelCadastroFuncionarioTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCadastroFuncionarioTitulo.setText("Cadastro de Usuário");

        jLabelMatricula1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelMatricula1.setText("Matricula");

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

        jBotaoAcao.setText("Salvar");
        jBotaoAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoAcaoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/spej/imagem/foto.png"))); // NOI18N

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuário");

        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });

        jLabelUsuario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario1.setText("Senha");

        jTextMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTextMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMatriculaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPanelTelaLayout = new javax.swing.GroupLayout(JPanelTela);
        JPanelTela.setLayout(JPanelTelaLayout);
        JPanelTelaLayout.setHorizontalGroup(
            JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelTelaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMatricula1)
                            .addComponent(jDataNascimento)
                            .addComponent(jTextMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addComponent(jLabeNomeCompleto)
                                .addGap(0, 504, Short.MAX_VALUE))
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))
                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                        .addComponent(jLabelDataNascimento)
                        .addContainerGap())
                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCargo)
                            .addComponent(jTextCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsuario)
                            .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDepartamento)
                                .addGap(0, 431, Short.MAX_VALUE))
                            .addGroup(JPanelTelaLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelUsuario1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboDepartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBotaoAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(JPanelTelaLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabelCadastroFuncionarioTitulo)
                .addGap(0, 354, Short.MAX_VALUE))
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
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataNascimento)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jDataNascimento))
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
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(JPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelTelaLayout.createSequentialGroup()
                        .addComponent(jLabelUsuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jBotaoAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

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
        
        //Campos para Validação
        if (jTextMatricula.getText().length() == 0) {
            Mensagem.aviso(this, "O campo matricula é obrigatório!", "Aviso");
        }else if (jTextNome.getText().length() == 0) {
            Mensagem.aviso(this, "O campo nome é obrigatório!", "Aviso");
        }else if (jTextEmail.getText().length() == 0) {
            Mensagem.aviso(this, "O campo email é obrigatório!", "Aviso");
        }else if (jDataNascimento.getText().length() == 0) {
            Mensagem.aviso(this, "O campo de data de nascimento é obrigatório!", "Aviso");
        }else if (jTextCargo.getText().length() == 0) {
            Mensagem.aviso(this, "O campo cargo é obrigatório!", "Aviso");
        }else if (jComboDepartamento.getSelectedItem() == null) {
            Mensagem.aviso(this, "O campo departamento é obrigatório!", "Aviso");
        }else if (jTextUsername.getText().length() == 0) {
            Mensagem.aviso(this, "O campo usuario é obrigatório!", "Aviso");
        }else if (jPasswordField1.getText().length() == 0) {
            Mensagem.aviso(this, "O campo senha é obrigatório!", "Aviso");
        }else{
            UsuarioController uc = new UsuarioController();
            Usuario usuario = new Usuario();

            try {
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                
                Departamento d = (Departamento) jComboDepartamento.getSelectedItem();

                usuario.setMatricula( Integer.parseInt(jTextMatricula.getText() ) );
                usuario.setNome( jTextNome.getText() );
                usuario.setCargo( jTextCargo.getText() );
                usuario.setDepartamento( d.getId() );
                usuario.setUsername( jTextUsername.getText() );
                usuario.setPassword( String.valueOf(jPasswordField1.getPassword()) );
                usuario.setNascimento( new java.sql.Date(dateFormat.parse(jDataNascimento.getText()).getTime()) );
                usuario.setEmail( jTextEmail.getText() );

                if(this.criando) {
                    uc.insert(usuario);
                } 
                else {
                    uc.update(user, usuario);
                }
                Mensagem.sucesso(this, "Usuário " + (criando ? "cadastrado" : "editado") + " com sucesso!");
                dispose();
            }
            catch(RuntimeException e) {
                Mensagem.erro(this, e.getMessage(), "Falha ao " + (criando ? "criar" : "editar") + " usuário");
            }
            catch(Exception e) {
                Mensagem.erro(this, "Erro desconhecido!\n" + e.getMessage(), "Falha ao " + (criando ? "criar" : "editar") + " usuário");
            }
        }      
        
    }//GEN-LAST:event_jBotaoAcaoActionPerformed

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed

    private void jTextMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMatriculaKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_jTextMatriculaKeyTyped

    private void jTextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyTyped
        
    }//GEN-LAST:event_jTextNomeKeyTyped

    
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
    private javax.swing.JFormattedTextField jDataNascimento;
    private javax.swing.JLabel jLabeNomeCompleto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCadastroFuncionarioTitulo;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMatricula1;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextCargo;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JFormattedTextField jTextMatricula;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables
}
