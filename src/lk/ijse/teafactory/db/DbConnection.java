package lk.ijse.teafactory.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private Connection connection;

    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/TeaFactory","root","1234");
    }

    public static DbConnection  getInstance() throws SQLException, ClassNotFoundException {
        if (dbConnection==null){
            return dbConnection = new DbConnection();
        }else {
            return dbConnection;
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
