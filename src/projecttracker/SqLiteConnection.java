/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttracker;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tahab
 */
public class SqLiteConnection {
    
     public static java.sql.Connection connect() {
        // SQLite connection string
        System.out.println("in connect");
        String url = "jdbc:sqlite:Project Directory.db";
        java.sql.Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("connection established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
