/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author Saint Luang
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloClass {
    private int id;
    private String message;

    public HelloClass(){
        
    }
    
    public HelloClass(int id){
        this.id = id;
    }
    
    public HelloClass(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloClass{" + "id=" + id + ", message=" + message + '}';
    }
    
 public String pullMessage(int id){
        Connection con = null;
        HelloClass hello = null;
        String message = null;
        try {
            con = ConnectionBuilder.getMySqlCond();
            PreparedStatement pstm = con.prepareStatement("SELECT data FROM hellodb WHERE dataid=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                message = rs.getString("data");
            }
            rs.close();
            pstm.close();
            con.close();
          } catch (SQLException ex) {
            Logger.getLogger(HelloClass.class.getName()).log(Level.SEVERE, null, ex);
            message = "SQL Exception";
        }
        
        return message;
    }
 
    public static void main(String[] args) {
        HelloClass hc = new HelloClass();
        System.out.println(hc.pullMessage(1));
        
    }
    
}
