package Controler;

import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vhs_producoes.Venda;

public class VendaC {
         public void InserirVenda(Venda v) throws SQLException{
        Util c = new Util();
        Connection conexao = c.conecta();
        String sql = "INSERT INTO Venda(data, valor) VALUES (?, ?) ";
        PreparedStatement statement = conexao.prepareStatement(sql);       
        statement.setString(1, v.getData());
                statement.setInt(2, v.getValor());

        
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null,"Nova venda inserida com sucesso");
            }
            
            statement.close();
            conexao.close();        
    }
    
     public ArrayList getAll() throws SQLException {

            String sql = "SELECT * FROM Venda";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Venda> lista = new ArrayList<Venda>();
            while (result.next()) {
                Venda v = new Venda (result.getString("data"), result.getInt("valor"));
                lista.add(v);
            }

            statement.close();
            conexao.close();
            return lista;

     
    }
    
}
