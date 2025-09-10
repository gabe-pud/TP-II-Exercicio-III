package br.edu.fatecpg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
    public static Connection connect() throws SQLException {
        try {
            var jdbcUrl = "jdbc:postgresql://localhost:5432/*******";
            var user = "fatec";
            var password = "fatec777";

            return DriverManager.getConnection(jdbcUrl,user,password);
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }
}
