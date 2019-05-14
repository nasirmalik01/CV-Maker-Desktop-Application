/*
package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    private DbConnect()
    {

    }

    public static DbConnect getInstance()
    {
        return new DbConnect();
    }

    public Connection getconnection()
    {
        String connect_string = "jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle_1";
        Connection connection = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(connect_string);

        }catch (SQLException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
*/
