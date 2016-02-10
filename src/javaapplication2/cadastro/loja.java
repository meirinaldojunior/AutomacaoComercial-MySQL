/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.cadastro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static javaapplication2.configuracoes.base_de_dados.banco_acesso;
import static javaapplication2.configuracoes.base_de_dados.caminho_banco;
import static javaapplication2.configuracoes.base_de_dados.porta_banco;
import static javaapplication2.configuracoes.base_de_dados.senha_banco;
import static javaapplication2.configuracoes.base_de_dados.usuario_banco;
import javax.swing.JOptionPane;

/**
 *
 * @author meirinaldo
 */
public class loja extends javax.swing.JFrame {

    /**
     * Creates new form loja
     */
    public loja() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        razaoSocial_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fantasia_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cnpj_field = new javax.swing.JTextField();
        ICMS_opcao = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        admToken_field = new javax.swing.JTextField();
        bt_cadastro_loja = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        telefone_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        endereco_field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cidade_field = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        estado_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de loja");

        jLabel2.setText("Razão social:");

        jLabel3.setText("Nome Fantasia:");

        jLabel5.setText("CNPJ:");

        cnpj_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpj_fieldActionPerformed(evt);
            }
        });

        ICMS_opcao.setText("Recolhe ICMS");

        jLabel6.setText("Administração do sistema");

        jLabel7.setText("Token do usuário:");

        admToken_field.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        bt_cadastro_loja.setText("Cadastrar");
        bt_cadastro_loja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadastro_lojaActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefone");

        jLabel9.setText("Endereço:");

        jLabel10.setText("Cidade");

        jLabel11.setText("Estado");

        jLabel12.setText("email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(92, 92, 92))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_cadastro_loja)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(admToken_field)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(razaoSocial_field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fantasia_field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(cidade_field, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estado_field, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(endereco_field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(cnpj_field, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ICMS_opcao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone_field))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_field)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(razaoSocial_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fantasia_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cnpj_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ICMS_opcao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel8))
                            .addComponent(telefone_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(endereco_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidade_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estado_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(admToken_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_cadastro_loja)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cnpj_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpj_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpj_fieldActionPerformed

    private void bt_cadastro_lojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadastro_lojaActionPerformed
        // mensagem de confirmação de inserção da loja
        int Autorizacao_insercao = JOptionPane.showConfirmDialog(null, "Deseja incluir a loja "+ razaoSocial_field.getText()
                + " e incluir o usuário dono do Token: "+ admToken_field.getText() + " como administrador do sistema? isso dará acesso a todas as funcionalidades do mesmo.");
        //pegando boolena da opção recolhimento de ICMS
        
        boolean estado = ICMS_opcao.isSelected();
        
       if(Autorizacao_insercao == 0){

       //Salvar Loja no banco
        
           try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
 
            //Abrindo a conexão: ATENÇÃO OS DOIS PARÂMETROS VAZIOS("") SÃO USUÁRIO E SENHA, RESPECTIVAMENTE.
            Connection conn = DriverManager.getConnection("jdbc:mysql://"+caminho_banco+":"+porta_banco+"/"+banco_acesso, usuario_banco, senha_banco);
 
            //Executa a query de inserção
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO loja (id,razao_social,fantasia,cnpj,icms,token_adm) VALUES ("
                    +  "0,'"
                    + this.razaoSocial_field.getText() + "','"
                    + this.fantasia_field.getText() + "','"
                    + this.cnpj_field.getText() + "','"
                    + estado //diz ao cadastro que a empresa recolhe ICMS
                    + this.admToken_field.getText() + "')");
 
            JOptionPane.showMessageDialog(rootPane, "Loja Cadastrada com Sucesso!");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }//Fim try

       //Salvar Arquivo das configurações da loja
           SalvarArquivoConfigLoja();
       
       
       } 
    }//GEN-LAST:event_bt_cadastro_lojaActionPerformed

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
            java.util.logging.Logger.getLogger(loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loja().setVisible(true);
            }
        });
    }
    
    public void SalvarArquivoConfigLoja(){
        
        Boolean erro_gravar = false;
        
        //salvando configurações feitas
        File arquivo = new File("con_loja.sist");
        try( FileWriter fw = new FileWriter(arquivo) ){
            fw.write("#### razao_social=\n");
            fw.write(razaoSocial_field.getText()+"\n");
            fw.write("#### fantasia=\n");
            fw.write(fantasia_field.getText()+"\n");
            fw.write("#### cnpj=\n");
            fw.write(cnpj_field.getText()+"\n");
            fw.write("#### =Telefone\n");
            fw.write(telefone_field.getText()+"\n");
            fw.write("#### Endereço=\n");
            fw.write(endereco_field.getText()+"\n");
            fw.write("#### Cidade=\n");
            fw.write(cidade_field.getText()+"\n");
            fw.write("#### Estado=\n");
            fw.write(estado_field.getText()+"\n");
            fw.write("#### Email=\n");
            fw.write(email_field.getText());

            fw.flush();
        }catch(IOException ex){
            ex.printStackTrace();
            erro_gravar = true;
        }
        
        if(erro_gravar != true){
            JOptionPane.showMessageDialog(null, "Gravado com sucesso...!");
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao salvar! \nVerifique as configurações inseridas e tente novamente!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ICMS_opcao;
    private javax.swing.JTextField admToken_field;
    private javax.swing.JButton bt_cadastro_loja;
    private javax.swing.JTextField cidade_field;
    private javax.swing.JTextField cnpj_field;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField endereco_field;
    private javax.swing.JTextField estado_field;
    private javax.swing.JTextField fantasia_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField razaoSocial_field;
    private javax.swing.JTextField telefone_field;
    // End of variables declaration//GEN-END:variables
}
