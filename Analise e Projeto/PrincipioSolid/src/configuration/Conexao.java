package configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String usuario = "root";
    private static final String senha = "1234";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/banco_muita_grana";
    private static final String driver = "com.mysql.cj.jdbc.Driver";


    public static Connection abrir() throws Exception {
        Class.forName(driver);

        Connection conn = DriverManager.getConnection(URL, usuario, senha);

        return conn;
    }


}
