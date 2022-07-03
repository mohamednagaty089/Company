/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comman;

import Entities.Login;
import Repo.LoginRepo;

/**
 *
 * @author Nagaty
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login ln=new Login();
        ln.setUsername("mostafanagaty");
        ln.setPassword("kdkdkdk233");
        LoginRepo login=new LoginRepo();
        System.out.println(login.insert(ln));
    }
    
}
