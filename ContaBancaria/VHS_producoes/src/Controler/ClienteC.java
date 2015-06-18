
package Controler;

import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vhs_producoes.Cliente;

public class ClienteC {
     public void InserirCliente(Cliente cl) throws SQLException{
        Util c = new Util();
        Connection conexao = c.conecta();
        String sql = "INSERT INTO Cliente(nome_cliente, RG_cliente, CPF_cliente, endereco, email_cliente, telefone) VALUES (?, ?, ?, ?, ?, ?) ";
        PreparedStatement statement = conexao.prepareStatement(sql);

        statement.setString(1, cl.getNome());
        statement.setString(2, cl.getRg());
        statement.setString(3, cl.getCpf());
        statement.setString(4, cl.getEndereco());
        statement.setString(5, cl.getEmail());
        statement.setString(6, cl.getTelefone());
        
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null,"Novo Cliente inserido com sucesso");
            }
            
            statement.close();
            conexao.close();        
    }
    
     public ArrayList getAll() throws SQLException {

            String sql = "SELECT * FROM Cliente";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Cliente> lista = new ArrayList<Cliente>();
            while (result.next()) {
                Cliente c = new Cliente (result.getString("nome_cliente"), result.getString("RG_cliente"), result.getString("CPF_cliente"), result.getString("endereco"), result.getString("email_cliente"), result.getString("telefone"), result.getInt("ID_cliente"));// inicializa agenda
                lista.add(c);
            }

            statement.close();
            conexao.close();
            return lista;

     
    }
    
}
