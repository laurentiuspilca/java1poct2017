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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class DatabaseController {
    
    private Connection con;
    
    private DatabaseController() {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final DatabaseController SINGLETON = new DatabaseController();
    }
    
    public static DatabaseController getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaAngajat(Angajat a) {
        String sql = "INSERT INTO angajati VALUES (NULL,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, a.getNume());
            stmt.setDouble(2, a.getSalariu());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Angajat> getAngajati() {
        List<Angajat> angajati = new ArrayList<>();
        
        String sql = "SELECT * FROM angajati";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Angajat a = new Angajat();
                a.setId(rs.getInt("id"));
                a.setNume(rs.getString("nume"));
                a.setSalariu(rs.getDouble("salariu"));
                angajati.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return angajati;
    }
}
