/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author meirinaldo
 */
public class loading extends javax.swing.JFrame {

    public static int erro_cod = 0;
    
    /**
     * Creates new form loading
     */
    public loading() {
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

        status_carregamento_bd = new javax.swing.JLabel();
        ver_config = new javax.swing.JButton();
        ver_conf_loja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        status_carregamento_bd.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        status_carregamento_bd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status_carregamento_bd.setText("AGUARDE... CARREGANDO BASE DE DADOS!");
        status_carregamento_bd.setBorder(null);

        ver_config.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        ver_config.setText("VERIFICAR CONFIGURAÇÕES DA BASE");
        ver_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_configActionPerformed(evt);
            }
        });

        ver_conf_loja.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        ver_conf_loja.setText("VERIFICAR CONFIGURAÇÕES DA LOJA");
        ver_conf_loja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_conf_lojaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(status_carregamento_bd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ver_conf_loja)
                    .addComponent(ver_config))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(status_carregamento_bd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(ver_config)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ver_conf_loja)
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ver_configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_configActionPerformed
        // Abrir configurações
        javaapplication2.configuracoes.base_de_dados frame_conf =
                new javaapplication2.configuracoes.base_de_dados();
        
        frame_conf.setVisible(true);
        
    }//GEN-LAST:event_ver_configActionPerformed

    private void ver_conf_lojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_conf_lojaActionPerformed
        javaapplication2.cadastro.loja frame_cadastro_loja = new javaapplication2.cadastro.loja();
        frame_cadastro_loja.setVisible(true);
    }//GEN-LAST:event_ver_conf_lojaActionPerformed

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
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
                
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel status_carregamento_bd;
    public static javax.swing.JButton ver_conf_loja;
    public static javax.swing.JButton ver_config;
    // End of variables declaration//GEN-END:variables
}
