/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        
        try (Connection con = 
                DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT * FROM angajati";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nume = rs.getString("nume");
                double salariu = rs.getDouble("salariu");
                System.out.println(id + " " + nume + " " + salariu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
