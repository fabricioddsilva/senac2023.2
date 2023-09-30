import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao {

    public static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/db_banco";
    private static final String driver = "com.mysql.cj.jdbc.Driver";


    public static Connection abrir() throws Exception {
        Class.forName(driver);

        Connection con = DriverManager.getConnection(url, user, password);

        return con;
    }

}
