package com.makuku.tmpk.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.makuku.tmpk.TmpkApplication;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConfig {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) init();
        return connection;
    }

    private static void init() {
        String currentDirectory = System.getProperty("user.dir");

        String jsonFilePath = currentDirectory + "/src/main/java/com/makuku/tmpk/config/dbconf.json";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));
            String url = rootNode.get("url").asText();
            String username = rootNode.get("username").asText();
            String password = rootNode.get("password").asText();

            String dbUrl = "jdbc:firebirdsql://localhost:3050/" + url;
            connection = DriverManager.getConnection(dbUrl, username, password);
            TmpkApplication.logger.info("Success connection");
        } catch (Exception e) {
            TmpkApplication.logger.error(e);
        }
    }
}
