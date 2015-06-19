package Controler;

import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vhs_producoes.Help;

public class HelpC {
    public void InserirHelp(Help h) throws SQLException{
        Util c = new Util();
        Connection conexao = c.conecta();
        String sql = "INSERT INTO Help(Helpcol) VALUES (?) ";
        PreparedStatement statement = conexao.prepareStatement(sql);

        statement.setString(1, h.getTipo());     

        
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null,"Novo help inserido com sucesso");
            }
            
            statement.close();
            conexao.close();        
    }
    
     public ArrayList getAll() throws SQLException {

            String sql = "SELECT * FROM Help";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Help> lista = new ArrayList<Help>();
            while (result.next()) {
                Help h = new Help(result.getString("Helpcol"), result.getInt("idHelp"));
                lista.add(h);
            }

            statement.close();
            conexao.close();
            return lista;

     
    }
    
    
}
