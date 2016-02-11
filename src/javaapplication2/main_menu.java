/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static javaapplication2.configuracoes.base_de_dados.banco_acesso;
import static javaapplication2.configuracoes.base_de_dados.caminho_banco;
import static javaapplication2.configuracoes.base_de_dados.porta_banco;
import static javaapplication2.configuracoes.base_de_dados.senha_banco;
import static javaapplication2.configuracoes.base_de_dados.usuario_banco;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javaapplication2.cadastro.*;

/**
 *
 * @author meirinaldo
 */
public class main_menu extends javax.swing.JFrame {

    /**
     * Creates new form main_menu
     */
    public static Boolean carregado = false;
    int controle_erro = 0;
    Boolean arquivo_loja_naoEncontrado = false;
    
    public main_menu() {
     
          
        final loading splash = new loading();  
        //coloca todos os componentes e deixa a splash bonitinha  
        javax.swing.SwingUtilities.invokeLater(new Runnable(){  

                    @Override  
                    public void run() {  
                       splash.setVisible(true);  
                    
                    initComponents();
                      bar_menu.setVisible(false);
                      bar_status.setVisible(false);
                     if(base_de_dados_concebida.getText() == null)
                         base_de_dados_concebida.setText("Base de dados não conectada");
                         base_de_dados_concebida.setBackground(Color.red);

                          //iniciando configurações salvas do banco
                     String[] arquivo = new String[5];
			try{			
                                FileReader entrada = new FileReader("con.sist");
                                BufferedReader leitor = new BufferedReader(entrada);
				int c = 0;
				String linha = null;
				while((linha = leitor.readLine()) != null)  {
					arquivo[c] = leitor.readLine();
					c++;					
				}
			}catch(IOException e){
                             loading.ver_conf_loja.setVisible(false);
                             loading.ver_config.enable(true);  
                            loading.status_carregamento_bd.setText("Configuração da base não realizada...!");
                               controle_erro = 1; // erro caso não tenha arquivos de configuração da base acrescenta 1 no variavel de controle de erro
                               System.out.printf("Configurações da base ausente");
			}

                        //seta campos configurações com os dados da conexão
                        caminho_banco = arquivo[0];
                        porta_banco = arquivo[1];
                        usuario_banco = arquivo[2]; 
                        senha_banco = arquivo[3];
                        banco_acesso = arquivo[4];
      
                        iniciandoConfLojaCadastrada();
                        
                        try {
                          //Registra JDBC driver
                          Class.forName("com.mysql.jdbc.Driver");

                          //Abrindo a conexão: ATENÇÃO OS DOIS PARÂMETROS VAZIOS("") SÃO USUÁRIO E SENHA, RESPECTIVAMENTE.
                          Connection conn = DriverManager.getConnection("jdbc:mysql://"+caminho_banco+":"+porta_banco+"/"+banco_acesso, usuario_banco, senha_banco);
                           
                           if(conn != null && arquivo_loja_naoEncontrado ==false){
                                //manda feedback para tela inicial
                               
                               bar_menu.setVisible(true);
                               bar_status.setVisible(true);
                               base_de_dados_concebida.setText("conectada com: "+banco_acesso);
                               base_de_dados_concebida.setBackground(Color.GREEN);
                               splash.dispose();
                               carregado = true;
                           }
                        
                        } catch (SQLException | ClassNotFoundException e) {
                          //erro na base, deixar usuário verificar o que aconteceu!
                          
                          carregado = false;
                          loading.status_carregamento_bd.setBackground(Color.red);
                          loading.ver_config.setVisible(true);
                      }//Fim try

                     
        
                    }  

                });
            
    }
    
    public void iniciandoConfLojaCadastrada(){
          //iniciando configurações salvas do banco
         String[] arquivo_confLoja = new String[8];
			try{			
                                FileReader entrada = new FileReader("con_loja.sist");
                                BufferedReader leitor = new BufferedReader(entrada);
				int c = 0;
				String linha = null;
				while((linha = leitor.readLine()) != null)  {
					arquivo_confLoja[c] = leitor.readLine();
					c++;					
				}
			}catch(IOException e){
                            
                            carregado = false;
                            if(controle_erro == 1){
                              loading.status_carregamento_bd.setText("Configuração da Base e Loja não realizada!!!"); 
                              loading.ver_conf_loja.enable(true);
                              loading.ver_config.enable(true);
                            } else if (controle_erro == 0) {
                                arquivo_loja_naoEncontrado = true;
                                carregado = false;
                                loading.status_carregamento_bd.setText("Configuração da loja não realizada..!");                                
                                loading.ver_conf_loja.enable(true);
                                loading.ver_config.setVisible(false);
                            }
                           
                            System.out.printf("Configurações da loja ausente");
			}

                        //seta campos configurações com os dados da conexão
                        razaosocial_label.setText(arquivo_confLoja[0]);
                        fantasia_label.setText(arquivo_confLoja[1]);
                        cnpj_label.setText(arquivo_confLoja[2]);
                        telefone_label.setText(arquivo_confLoja[3]);
                        endereco_label.setText(arquivo_confLoja[4] + " " + arquivo_confLoja[5]+ "," + arquivo_confLoja[6] );
                        email_label.setText(arquivo_confLoja[7]);
                        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bar_status = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        base_de_dados_concebida = new javax.swing.JLabel();
        razaosocial_label = new javax.swing.JLabel();
        fantasia_label = new javax.swing.JLabel();
        cnpj_label = new javax.swing.JLabel();
        endereco_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        telefone_label = new javax.swing.JLabel();
        bar_menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Automação Comercial");

        bar_status.setRollover(true);
        bar_status.setEnabled(false);

        jLabel2.setText("Base de Dados: ");
        bar_status.add(jLabel2);

        base_de_dados_concebida.setText("null");
        bar_status.add(base_de_dados_concebida);

        razaosocial_label.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        razaosocial_label.setForeground(new java.awt.Color(255, 0, 0));
        razaosocial_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        razaosocial_label.setText("Sem Razão Social Cadastrada");

        fantasia_label.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        fantasia_label.setForeground(new java.awt.Color(2, 11, 245));
        fantasia_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fantasia_label.setText("Sem Nome Fantasia Cadastrado");

        cnpj_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cnpj_label.setText("Sem CNPJ Cadastrado");

        endereco_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endereco_label.setText("Sem Endereço Cadastrado");

        email_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email_label.setText("Sem Email Cadastrado");

        telefone_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefone_label.setText("Sem Telefone Cadastrado");

        bar_menu.setEnabled(false);

        jMenu1.setText("Cadastros");

        jMenuItem1.setText("Produto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Fornecedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Entrada de Produto");
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("Loja");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        bar_menu.add(jMenu1);

        jMenu2.setText("Configurações");

        jMenuItem5.setText("Base de Dados");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenu4.setText("Venda");
        jMenu2.add(jMenu4);

        jMenuItem4.setText("Usuários");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        bar_menu.add(jMenu2);

        setJMenuBar(bar_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(razaosocial_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fantasia_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cnpj_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(endereco_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(email_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telefone_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
            .addComponent(bar_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(razaosocial_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fantasia_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnpj_label)
                .addGap(7, 7, 7)
                .addComponent(telefone_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endereco_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_label)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(bar_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       javaapplication2.cadastro.produto frame_cadastro;
       frame_cadastro = new javaapplication2.cadastro.produto();
       frame_cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        javaapplication2.cadastro.fornecedor frame_fornecedor = 
                    new javaapplication2.cadastro.fornecedor();
        
        frame_fornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        javaapplication2.configuracoes.base_de_dados frame_config_base =
                new javaapplication2.configuracoes.base_de_dados();
        
        frame_config_base.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Abrindo gerenciamento de usuários
        javaapplication2.configuracoes.usuarios frame_gerencia_usuario = 
                new javaapplication2.configuracoes.usuarios();
        
        frame_gerencia_usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
            // Abrir cadastro de loja
        loja frame_loja = new loja();
        frame_loja.setVisible(true);
                
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(carregado == true)
                    new main_menu().setVisible(true);
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bar_menu;
    private javax.swing.JToolBar bar_status;
    private javax.swing.JLabel base_de_dados_concebida;
    private javax.swing.JLabel cnpj_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel endereco_label;
    private javax.swing.JLabel fantasia_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel razaosocial_label;
    private javax.swing.JLabel telefone_label;
    // End of variables declaration//GEN-END:variables
}
