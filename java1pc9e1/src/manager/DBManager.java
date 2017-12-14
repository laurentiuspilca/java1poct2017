/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author student
 */
public class DBManager {
    private DBManager() {}
    
    private static final class SingletonHolder {
        private static final DBManager SINGLETON = new DBManager();
    }
    
    public static DBManager getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public Connection getConnection () throws SQLException {
        String url = "jdbc:mysql://localhost/java1pcurs9";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
}
