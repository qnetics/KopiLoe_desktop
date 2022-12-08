package com.coffee_shop.cli;

import java.sql.Connection;
import java.sql.Statement;

import com.coffee_shop.Configurations.DatabasesConfiguration;


public class SQLiteMigration {


    public static void main(String[] args) throws Exception {
      
        try {

            // calling databases configuration
            DatabasesConfiguration SQLiteConfig = new DatabasesConfiguration();

            // create sqlite connection
            Connection SQLiteConnection = SQLiteConfig.SQLiteConfiguration();   
            Statement SQLiteStatement = SQLiteConnection.createStatement();

            String SQLiteQuery = "CREATE TABLE UserOrder (" + 

                "Id               INTEGER  PRIMARY KEY AUTOINCREMENT, "+
                "ProductName      TEXT NOT NULL, "+
                "ProductPrice     INT  NOT NULL, "+
                "ProductQuantity  INT  NOT NULL, "+
                "ProductImage     TEXT NOT NULL"+
            ");";
    
            SQLiteStatement.executeUpdate(SQLiteQuery);

            SQLiteStatement.close();
            SQLiteConnection.close();

            System.out.println("\nMessage : Create Database Successfully\n");
  
        } catch (Exception ErrorMessage) {
           
            System.out.println(ErrorMessage);
            System.out.println("\nMessage : Create Database Fail\n");
  
        } 
  
     }
    
}
