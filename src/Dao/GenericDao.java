package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class GenericDao {

    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/challenge";
    private static final String DB_USER = "root";
    private static final String DB_USER_PASS = "Daniel";


    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_URL, DB_USER, DB_USER_PASS);
    }
}
