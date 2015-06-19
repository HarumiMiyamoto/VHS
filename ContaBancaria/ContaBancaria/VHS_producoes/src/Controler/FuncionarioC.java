package Controler;

import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vhs_producoes.Funcionario;

public class FuncionarioC {
    public void InserirFuncionario(Funcionario f) throws SQLException{
        Util c = new Util();
        Connection conexao = c.conecta();
        String sql = "INSERT INTO Funcionario(nome, endereco, telefone, email_funcionario, cpf_funcionario, rg_funcionario, carteira_trabalho, cargo, senha, login) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        PreparedStatement statement = conexao.prepareStatement(sql);

        statement.setString(1, f.getNome());
        statement.setString(2, f.getEndereco());
        statement.setString(3, f.getTel());
        statement.setString(4, f.getEmail());
        statement.setString(5, f.getCpf());
        statement.setString(6, f.getRg());
        statement.setString(7, f.getCarteira());
        statement.setString(8, f.getCargo());
        statement.setString(9, f.getSenha());
        statement.setString(10, f.getlogin());        

        
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null,"Novo funcionario inserido com sucesso");
            }
            
            statement.close();
            conexao.close();        
    }
    
     public ArrayList getAll() throws SQLException {

            String sql = "SELECT * FROM Funcionario";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
            while (result.next()) {
                Funcionario f = new Funcionario(result.getString("nome"), result.getString("endereco"), result.getString("telefone"), result.getString("email_funcionario"), result.getString("cpf_funcionario"), result.getString("rg_funcionario"), result.getString("carteira_trabalho"), result.getString("cargo"), result.getInt("id_funcionario"), result.getString("login"), result.getString("senha"));
                lista.add(f);
            }

            statement.close();
            conexao.close();
            return lista;

     
    }
    
    
}
