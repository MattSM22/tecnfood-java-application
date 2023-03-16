package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Está classe realiza a conexão com o banco de dados;
 * 
 */
public class Conexao {
    public Connection getConnection(){
        try {
            String servidor ="jdbc:mysql://localhost:3306/tecnofood?useTimezone=true&serverTimezone=UTC"; 
            String usuario="root";
            String senha="";
            
            System.out.println("CONEXÃO COM O BANCO DE DADOS FOI ESTABELECIDA");
            
            return DriverManager.getConnection(servidor,usuario,senha);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);  
        }
    }
}
