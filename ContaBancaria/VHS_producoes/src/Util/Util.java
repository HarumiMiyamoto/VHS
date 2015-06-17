package Util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author info206
 */
public class Util {

    /**
     * @param args the command line arguments
     */
 public Connection conecta() throws SQLException{
        // TODO code application logic here
    Connection conexao = null;

    

        


    String url ="jdbc:mysql://192.200.63.121/VHS";
    String user="root";
    String password="123456";
  try{
      

            conexao = DriverManager.getConnection(url,user, password);
                     System.out.println("Conexão obtida com sucesso.");
            conexao = DriverManager.getConnection(url, user, password);

}
    catch(SQLException sqlex){
    System.out.println("Erro na conexão "+ sqlex);
}
        return conexao;
    }

    public void desconecta(Connection conexao){
    try{
    conexao.close();
    }catch(SQLException sqlex){
    JOptionPane.showMessageDialog(null,"Erro na conexão "+ sqlex);
    }
    }
   
}   
    
   
 

