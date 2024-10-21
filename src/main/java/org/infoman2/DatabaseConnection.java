package org.infoman2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private String url = "jdbc:mysql://localhost:3340/fxapp";
    private String user = "app";
    private String password = "1234";
    private Connection connection;

    public DatabaseConnection(){
        try{
            connection = DriverManager.getConnection(url, user, password);
            //System.out.println("Connected successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
