/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookcollectionfacility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ardientehu_cis22034
 */
public class Books {
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    private ArrayList<ArrayList<String> > books = new ArrayList<ArrayList<String>>(9); 
    public static void main(String[] args) {
        // TODO code application logic here        
        String url = "jdbc:mysql://localhost:3306/nc4?zeroDateTimeBehavior=convertToNull [root on Default schema]";
        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement statement = conn.createStatement();
            String query = "SELECT * from tblbooks";
            ResultSet rs = statement.executeQuery(query);
        }catch(SQLException e){
            System.err.println("Got an exception!");
        }
        
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
    }
}
