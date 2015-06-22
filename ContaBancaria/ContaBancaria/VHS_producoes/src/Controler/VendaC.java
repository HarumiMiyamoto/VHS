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
        String sql = "INSERT INTO Vendas(data, valor, Funcionario_ID_funcionario, Filmagem_idfilmagem, Cliente_ID_Cliente) VALUES (?, ?, ?, ?, ?) ";
        PreparedStatement statement = conexao.prepareStatement(sql);       
        statement.setString(1, v.getData());
        statement.setInt(2, v.getValor());
        statement.setInt(3, v.getID_funcionario());
        statement.setInt(4, v.getIdFilmagem());
        statement.setInt(5, v.getID_cliente());
        

        
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null,"Nova venda inserida com sucesso");
            }
            
            statement.close();
            conexao.close();        
    }
    
     public ArrayList getAll() throws SQLException {

            String sql = "SELECT * FROM Vendas";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Venda> lista = new ArrayList<Venda>();
            while (result.next()) {
                Venda v = new Venda (result.getInt("IdVendas"), result.getInt("Funcionario_ID_funcionario"), result.getInt("Cliente_ID_cliente"), result.getString("data"), result.getInt("valor"));
                lista.add(v);
            }

            statement.close();
            conexao.close();
            return lista;

     
    }
    
}
