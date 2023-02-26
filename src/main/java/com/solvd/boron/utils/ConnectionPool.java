package com.solvd.citytransportationsystemproject.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.*;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionPool {
    final static Logger LOGGER = LogManager.getLogger(ConnectionPool.class);

    private static ConnectionPool instance;
    private static final int MAX_CONNECTIONS = 10;
    private LinkedBlockingQueue<java.sql.Connection> availableConnections;
    private String url;
    private String username;
    private String password;

    public ConnectionPool() {
        Properties prop = new Properties();
        try {
            prop.load(Files.newInputStream(Paths.get("/Users/parisamory/Documents/development/City-Transportation-System-Project/src/main/resources/config.properties")));
        } catch (IOException e) {
            LOGGER.info(e);
        }
        this.url = prop.getProperty("db.url");
        this.username = prop.getProperty("db.username");
        this.password = prop.getProperty("db.password");
        availableConnections = new LinkedBlockingQueue<>(MAX_CONNECTIONS);
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            try {
                availableConnections.add(DriverManager.getConnection(url, username, password));
            } catch (SQLException e) {
                LOGGER.info(e);
            }
        }
    }

    public static ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public java.sql.Connection getConnection() {
        try {
            return availableConnections.take();
        } catch (InterruptedException e) {
            LOGGER.info(e);
            throw new IllegalStateException("Failed to get a connection", e);
        }
    }


    public void releaseConnection(java.sql.Connection connection) {
        if (connection != null){
            try{
                availableConnections.put(connection);
            } catch (InterruptedException e){
                LOGGER.info(e);
            }
        }
    }

}