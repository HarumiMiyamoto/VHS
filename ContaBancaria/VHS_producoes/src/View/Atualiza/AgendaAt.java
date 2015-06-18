/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Atualiza;

import Util.Util;
import View.Funcionario.AgendaCon;
import View.Funcionario.AgendaCon;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author info206
 */
public class AgendaAt extends javax.swing.JFrame {

    /**
     * Creates new form AgendaAt
     */
    public AgendaAt() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        local_gravacao = new javax.swing.JTextField();
        atualizarLG = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        atualizarD = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        atualizarH = new javax.swing.JButton();
        atualizarTG = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tipo_gravacao = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        id_agenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("ATUALIZAR AGENDA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 49, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        voltar.setText("<--");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 11, 0);
        getContentPane().add(voltar, gridBagConstraints);

        jLabel2.setText("Local da gravação:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.ipadx = 291;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        getContentPane().add(local_gravacao, gridBagConstraints);

        atualizarLG.setText("Atualizar");
        atualizarLG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarLGActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 10);
        getContentPane().add(atualizarLG, gridBagConstraints);

        jLabel3.setText("Data:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        getContentPane().add(data, gridBagConstraints);

        atualizarD.setText("Atualizar");
        atualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(atualizarD, gridBagConstraints);

        jLabel4.setText("Hora:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        getContentPane().add(hora, gridBagConstraints);

        jLabel5.setText("tipo de gravação:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        atualizarH.setText("Atualizar");
        atualizarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarHActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(atualizarH, gridBagConstraints);

        atualizarTG.setText("Atualizar");
        atualizarTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTGActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(141, 6, 0, 10);
        getContentPane().add(atualizarTG, gridBagConstraints);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 30, 11, 10);
        getContentPane().add(sair, gridBagConstraints);

        tipo_gravacao.setColumns(20);
        tipo_gravacao.setRows(5);
        jScrollPane1.setViewportView(tipo_gravacao);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 272;
        gridBagConstraints.ipady = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jLabel6.setText("ID da Agenda:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 31, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 4, 0, 0);
        getContentPane().add(id_agenda, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.dispose();
        new AgendaCon().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void atualizarLGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarLGActionPerformed
                try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Agenda SET  local_gravacao ='" + local_gravacao.getText() + "'" + " WHERE ID_agenda = '" + Integer.parseInt(id_agenda.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "Local atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarLGActionPerformed

    private void atualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarDActionPerformed
                try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Agenda SET data = '" + data.getText() + "'" + " WHERE ID_agenda = '" + Integer.parseInt(id_agenda.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "Data  atualizada");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarDActionPerformed

    private void atualizarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarHActionPerformed
                try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Agenda SET hora = '" + hora.getText() + "'" + " WHERE ID_agenda = '" + Integer.parseInt(id_agenda.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "Hora atualizada");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarHActionPerformed

    private void atualizarTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTGActionPerformed
               try {
            //Registra JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //Abrindo a conexão
            Util c = new Util();
            Connection conexao = c.conecta();

            //Executa a query de atualização
            Statement statement = conexao.createStatement();
            statement.executeUpdate("UPDATE Agenda SET tipo_gravacao = '" + tipo_gravacao.getText() + "'" + " WHERE ID_agenda = '" + Integer.parseInt(id_agenda.getText()) + "'");
            JOptionPane.showMessageDialog(rootPane, "Tipo de gravação atualizado");
        }
        catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, "ID não existente");
        }//Fim try
    }//GEN-LAST:event_atualizarTGActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaAt().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarD;
    private javax.swing.JButton atualizarH;
    private javax.swing.JButton atualizarLG;
    private javax.swing.JButton atualizarTG;
    private javax.swing.JTextField data;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField id_agenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField local_gravacao;
    private javax.swing.JButton sair;
    private javax.swing.JTextArea tipo_gravacao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}