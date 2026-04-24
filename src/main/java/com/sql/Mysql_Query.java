package com.sql;

import java.sql.*;
import java.util.Properties;

public class Mysql_Query {

    public static void main(String[] args) {

        try {
            Connection dbConnection = null;

            try {
                String url = "jdbc:mysql://localhost/test";
                Properties info = new Properties();
                info.put("user", "root");
                info.put("password", "Laxmi@2006");

                dbConnection = DriverManager.getConnection(url, info);

                if (dbConnection != null) {
                    System.out.println("Successfully connected to MySQL database test");
                }

            } catch (SQLException ex) {
                System.out.println("Connection error!");
                ex.printStackTrace();
            }

            // Check connection
            if (dbConnection == null) {
                System.out.println("Connection failed. Exiting...");
                return;
            }

            // Using PreparedStatement (better practice)
            String query = "SELECT * FROM coffee WHERE coffee_name LIKE ?";
            PreparedStatement ps = dbConnection.prepareStatement(query);
            ps.setString(1, "D%");

            ResultSet rs = ps.executeQuery();

            // Display results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("coffee_name");
                int price = rs.getInt("price");

                System.out.println(id + " " + name + " " + price);
            }

            // Close resources
            rs.close();
            ps.close();
            dbConnection.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}