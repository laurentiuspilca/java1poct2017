/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            DriverManager.getConnection(url,username,password)) {
            
            Statement stmt = con.createStatement();
            
            String nume = "Pop";
            String prenume = "Gigel";
            String tel = "0728888888";
            
            String sql = "INSERT INTO persoane VALUES "
                    + "(NULL, '"+nume+"', '"+prenume+"', '"+tel+"')";
        
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
