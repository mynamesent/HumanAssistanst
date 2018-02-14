/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author Saint Luang
 * 
 */


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionBuilder {
    Connection conn = null;
    static String test = "";

    public static Connection getMySqlCond() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try {
            Properties prop = new Properties();
            InputStream input = classloader.getResourceAsStream("config.properties");
            prop.load(input);
            String mysqlurl = prop.getProperty("mysqlurl");
            String mysqluser = prop.getProperty("mysqluser");
            String mysqlpassword = prop.getProperty("mysqlpassword");

            test = "url:" + mysqlurl + ", dbuser:" + mysqluser + ", dbpassword:" + mysqlpassword;

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded success");

            conn = DriverManager.getConnection(mysqlurl, mysqluser, mysqlpassword);
            System.out.println("Connected");

        } catch (IOException ex) {
            Logger.getLogger(ConnectionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionBuilder con = new ConnectionBuilder();
        con.getMySqlCond();
    }
    
}
