package Controller;


import Util.Util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vhs_producoes.Funcionario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author info206
 */
public class LoginContoler {
    public Funcionario autentica(String login , String senha) throws SQLException {
        String sql = "SELECT * FROM Funcionario WHERE login like '%" + login + "%' AND '%"+senha+"%'"; //Consulta SQL 
        Util util = new Util(); //inicializando minha classe q faz conexão com banco de dados
        Connection conexao = util.conecta(); //faz a conexão com banco
        Statement statement = conexao.createStatement();//usa da conqxão para pegar a credencial para acesso ao banco
        ResultSet result = statement.executeQuery(sql);//executa a consulta SQL e agora retoena valores, por isso ResultSet
        Funcionario l = null;  //declaração de variavel  funcionario
        while (result.next()) {
            l = new Funcionario(result.getString("cargo"), result.getString("login"),result.getString("senha"));// inicializa funcionario
        }
        return l;
        

    }
    
    //select senha from cadastro_usuario where login = USUARIO_QUE_VOCE_DIGITOU 
    //    ResultSet rs // ...  
    //if(rs.next()){ // se tiver correto entra  
    // código caso o login esteja correto  
   // }else{  
    // código caso o login esteja incorreto
/*stmt=con.prepareStatement("select *"nomes da tabela" where login from usuario");
rs = stmt.executeQuery();
    }  */
/*//metodo que verifica o login  
public Boolean login(String usuario, String senha){  
     boolean existe = false;  
     PreparedStatement stm = conexao.prepareStatement("SELECT * FROM usuarios WHERE login =" + AND password = ?");  
     stm.setString(1, usuario);  
     stm.setString(2, senha);  
     ResultSet rs = stm.executeQuery();  
     if(rs.next()){  
         existe = true;  
     }  
     return existe;  
}     
*/
}
