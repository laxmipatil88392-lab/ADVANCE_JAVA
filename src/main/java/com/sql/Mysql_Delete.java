package com.sql;

import java.sql.*;
import java.util.Properties;

public class Mysql_Delete {
    public static void main(String[] args) {

        try {
            Connection dbConnection = null;

            String url = "jdbc:mysql://localhost/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            // DELETE first
            String deleteQuery = "DELETE FROM coffee WHERE id = 104";
            PreparedStatement ps = dbConnection.prepareStatement(deleteQuery);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record deleted successfully\n");
            } else {
                System.out.println("No record found with given ID\n");
            }

            ps.close();

            // SELECT after delete
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("coffee_name");
                int price = rs.getInt("price");

                System.out.println(id + " " + name + " " + price);
            }

            // Close resources properly
            rs.close();
            st.close();
            dbConnection.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
