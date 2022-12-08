package com.coffee_shop.Testing;


import java.sql.*;
import com.coffee_shop.Configurations.DatabasesConfiguration;


public class DbTest {

   public static void main( String args[] ) throws Exception {
      
      try {
         DatabasesConfiguration config = new DatabasesConfiguration();
         Connection c = config.SQLiteConfiguration();
         
         System.out.println("Opened database successfully");

         Statement stmt = c.createStatement();

         String sql = "CREATE TABLE COMPANY " +
                        "(ID INT PRIMARY KEY     NOT NULL," +
                        " NAME           TEXT    NOT NULL, " + 
                        " AGE            INT     NOT NULL, " + 
                        " ADDRESS        CHAR(50), " + 
                        " SALARY         REAL)"; 

         stmt.executeUpdate(sql);
         stmt.close();
         c.close();

      } catch ( Exception e ) {
         
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);

      } finally {
         System.out.println("Table created successfully");
      }

   }
}
