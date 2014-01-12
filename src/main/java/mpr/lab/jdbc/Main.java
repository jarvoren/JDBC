package mpr.lab.jdbc;

import java.util.*;
import java.sql.*;
 
public class Main {
 
    public static void main(String[] args) {
        // sekcja try umożliwia wychwycenie błędów
        try {
            Class.forName("org.hsqldb.jdbcDriver");
           
            Enumeration en=DriverManager.getDrivers();
           
            
            System.out.println("Podaj  nazwe towaru do wpisania");
            
            String nazwa = EasyIn.getString();
            System.out.println("Podaj koszt  towaru do wpisania");
            int koszt = EasyIn.getInt();
            System.out.println("Podaj cene nazwe towaru do wpisania");
            int cena = EasyIn.getInt();
            Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb","sa","");
            String queryStr = "INSERT INTO TOWAR  VALUES (20,'"+nazwa+"',"+koszt+","+cena+") ";
            System.out.println(queryStr);
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(queryStr);
            
           
          
          
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
 
}
