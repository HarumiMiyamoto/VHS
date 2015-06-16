package Controler;

import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vhs_producoes.Filmagem;

public class FilmagemC {
    public void InserirFilmagem(Filmagem f) throws SQLException{
        Util c = new Util();
        Connection conexao = c.conecta();
        String sql = "INSERT INTO Agenda(Descr_filmagem, data_entrega) VALUES (?, ?) ";
        PreparedStatement statement = conexao.prepareStatement(sql);

        statement.setString(2, f.getDescr_filmagem());
        statement.setString(3, f.getData_entrega());

        
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null,"Nova filmagem inserida com sucesso");
            }
            
            statement.close();
            conexao.close();        
    }
    
     public ArrayList getAll() throws SQLException {

            String sql = "SELECT * FROM Filmagem";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Filmagem> lista = new ArrayList<Filmagem>();
            while (result.next()) {
                Filmagem f = new Filmagem(result.getString("Descr_filmagem"), result.getString("data_entrega") );// inicializa agenda
                lista.add(f);
            }

            statement.close();
            conexao.close();
            return lista;

     
    }
    
}
