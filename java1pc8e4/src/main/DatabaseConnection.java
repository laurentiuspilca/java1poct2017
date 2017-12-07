/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author student
 */
public class DatabaseConnection {
    
    private Connection con;
    
    private DatabaseConnection() {
        try {
            String url = "jdbc:mysql://localhost/java1pcurs8";
            String username = "root";
            String password = "";

            con = DriverManager.getConnection(url, username, password);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final DatabaseConnection SINGLETON = new DatabaseConnection();
    }
    
    public static DatabaseConnection getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    
    public void adaugaAngajat(String nume, double salariu) {
        String sql = "INSERT INTO angajati VALUES (NULL,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nume);
            stmt.setDouble(2, salariu);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
