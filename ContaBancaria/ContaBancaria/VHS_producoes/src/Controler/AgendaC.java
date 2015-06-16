
package Controler;

import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vhs_producoes.Agenda;

public class AgendaC {
      public void InserirAgenda(Agenda a) throws SQLException{
        Util c = new Util();
        Connection conexao = c.conecta();
        String sql = "INSERT INTO Agenda(locla_gravacao, hora, data, tipo_gravacao) VALUES (?, ?, ?, ?) ";
        PreparedStatement statement = conexao.prepareStatement(sql);

        statement.setString(2, a.getLocal_gravacao());
        statement.setString(3, a.getHora());
        statement.setString(4, a.getData());
        statement.setString(5, a.getTipo_gravacao());
        
        int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null,"Nova Gravação inserida na agenda com sucesso");
            }
            
            statement.close();
            conexao.close();        
    }
    
     public ArrayList getAll() throws SQLException {

            String sql = "SELECT * FROM Agenda";

            Util util = new Util();
            Connection conexao = util.conecta();
            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ArrayList<Agenda> lista = new ArrayList<Agenda>();
            while (result.next()) {
                Agenda a = new Agenda (result.getString("local_gravacao"), result.getString("hora"), result.getString("data"), result.getString("tipo_gravacao"));// inicializa agenda
                lista.add(a);
            }

            statement.close();
            conexao.close();
            return lista;

     
    }
    
}
