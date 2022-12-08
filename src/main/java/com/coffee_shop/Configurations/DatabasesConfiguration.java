package com.coffee_shop.Configurations;


import java.sql.Connection;
import java.sql.DriverManager;


interface DatabasesConfigurationBehaviours {


    Connection SQLiteConfiguration() throws Exception;

}


public class DatabasesConfiguration extends EnvironmentVariableConfiguration 
    implements DatabasesConfigurationBehaviours {
    

    public Connection SQLiteConfiguration() throws Exception {

        Class.forName("org.sqlite.JDBC");
        Connection SqliteConnection = DriverManager.getConnection("jdbc:sqlite:" +
            this.Environment.getProperty("SQLITE_DATABASE_FILE"));

        return SqliteConnection;

    }


}