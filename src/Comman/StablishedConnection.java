/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nagaty
 */
public class StablishedConnection {
    
    private final String url="jdbc:mysql://localhost:3306/Company";
    private final String username="root";
    private final String password="";
    
    public Connection createConnection()throws SQLException{
        
        Connection con=  DriverManager.getConnection(url, username, password);
        return con;
    }
    
}
