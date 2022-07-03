/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repo;

import Comman.StablishedConnection;
import Entities.Login;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nagaty
 */
public class LoginRepo {
    
    private StablishedConnection connection=new StablishedConnection();
    
    public int insert(Login login){
        int result=-1;
        
        try(Connection con=connection.createConnection();
             Statement stat=con.createStatement();){
              
               String query="insert into Login values('"+login.getUsername()+"','"+login.getPassword()+"')";
               result=stat.executeUpdate(query);
               
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return result;
                
    }
    
}
