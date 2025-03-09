package az.turingacademy.module03.lesson33.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "tural123";


    public static Connection getConnect() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}