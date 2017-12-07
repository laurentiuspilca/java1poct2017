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
import java.sql.Statement;

/**
 *
 * @author student
 */
public class Exemplu2 {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        
        try (Connection con = 
            DriverManager.getConnection(url,username,password)) {
            
            String sql = "INSERT INTO persoane VALUES (NULL,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            String nume = "Pop";
            String prenume = "Gigel";
            String tel = "0728888888";
            
            stmt.setString(1, nume);
            stmt.setString(2, prenume);
            stmt.setString(3, tel);
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
