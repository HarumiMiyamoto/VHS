/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Atualiza;

import Util.Util;
import View.Funcionario.ClienteAlt;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author info206
 */
public class AtualizarC extends javax.swing.JFrame {

    /**
     * Creates new form AtualizarC
     */
    public AtualizarC() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
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
        nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        atualizarN = new javax.swing.JButton();
        atualizarR = new javax.swing.JButton();
        atualizarC = new javax.swing.JButton();
        atualizarE = new javax.swing.JButton();
        atualizarT = new javax.swing.JButton();
        atualizarEm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ATUALIZAR CLIENTE");

        jLabel2.setText("Nome:");

        jLabel3.setText("RG:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Tel:");

        jLabel7.setText("E-mail:");

        atualizarN.setText("Atualizar");
        atualizarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarNActionPerformed(evt);
            }
        });

        atualizarR.setText("Atualizar");
        atualizarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarRActionPerformed(evt);
            }
        });

        atualizarC.setText("Atualizar");
        atualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarCActionPerformed(evt);
            }
        });

        atualizarE.setText("Atualizar");
        atualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarEActionPerformed(evt);
            }
        });

        atualizarT.setText("Atualizar");
        atualizarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTActionPerformed(evt);
            }
        });

        atualizarEm.setText("Atualizar");
        atualizarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarEmActionPerformed(evt);
            }
        });

        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("ID do cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(atualizarT))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atualizarN))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atualizarR))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atualizarC))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atualizarE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atualizarEm))
                            .addComponent(jLabel6))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarEm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarT))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarNActionPerformed
                        try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Cliente SET  nome_cliente = '" + nome.getText() + "'" + " WHERE ID_cliente = '" + Integer.parseInt(id_cliente.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "Nome atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarNActionPerformed

    private void atualizarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarRActionPerformed
                               try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Cliente SET  RG_cliente = '" + rg.getText() + "'" + " WHERE ID_cliente = '" + Integer.parseInt(id_cliente.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "RG atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarRActionPerformed

    private void atualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarCActionPerformed
                               try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Cliente SET  CPF_cliente = '" + cpf.getText() + "'" + " WHERE ID_cliente = '" + Integer.parseInt(id_cliente.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "CPF atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarCActionPerformed

    private void atualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarEActionPerformed
                               try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Cliente SET endereco = '" + endereco.getText() + "'" + " WHERE ID_cliente = '" + Integer.parseInt(id_cliente.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "endereço atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarEActionPerformed

    private void atualizarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTActionPerformed
                               try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Cliente SET  telefone = '" + tel.getText() + "'" + " WHERE ID_cliente = '" + Integer.parseInt(id_cliente.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "telefone atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarTActionPerformed

    private void atualizarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarEmActionPerformed
                               try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Cliente SET email_cliente = '" + email.getText() + "'" + " WHERE ID_cliente = '" + Integer.parseInt(id_cliente.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "E-mail atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarEmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new ClienteAlt().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarC().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarC;
    private javax.swing.JButton atualizarE;
    private javax.swing.JButton atualizarEm;
    private javax.swing.JButton atualizarN;
    private javax.swing.JButton atualizarR;
    private javax.swing.JButton atualizarT;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
