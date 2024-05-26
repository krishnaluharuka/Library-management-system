/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kpk;

/**
 *
 * @author Dell
 */
import java.sql.*;

public class conn {
    public static Connection con;
    public static void dbconnect() throws Exception
    {
            Class.forName("com.mysql.cj.jdbc.Driver");
        try
        {
           con=DriverManager.getConnection("jdbc:mysql://localhost/library","root","krishna@123");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) throws Exception
    {
        new conn();
        
    }

    static void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
