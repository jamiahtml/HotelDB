/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.sql.*;
import java.sql.Connection;
public class Connections {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName(("com.mysql.jdbc.Driver"));
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/random", "root","miamiamia19");
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        return con;
    }
}
