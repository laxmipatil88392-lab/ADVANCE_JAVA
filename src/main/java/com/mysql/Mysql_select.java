//Lab 11a. Read all the existing records from the table coffee which is from the database test and insert a
//new coffee product into it
package com.mysql;
import java.sql.*;
import java.util.Properties;

public class Mysql_select {

public static void main(String[] args) {

try {
Connection dbConnection = null;

try {
String url = "jdbc:mysql://localhost:3306/test";   // ✅ added port
Properties info = new Properties();
info.put("user", "root");
info.put("password", "");

// ✅ load driver (important)
Class.forName("com.mysql.cj.jdbc.Driver");

dbConnection = DriverManager.getConnection(url, info);

if (dbConnection != null) {
System.out.println("Successfully connected to MySQL database test");
}
}
catch (Exception ex) {
System.out.println("An error occurred while connecting MySQL database");
ex.printStackTrace();
}

// SELECT query
String query = "SELECT * FROM coffee";

// create statement
Statement st = dbConnection.createStatement();

// execute query
ResultSet rs = st.executeQuery(query);

// display results
while (rs.next()) {
int id = rs.getInt("id");
String coffee_name = rs.getString("coffee_name");
int price = rs.getInt("price");

System.out.format("\n%d, %s, %d", id, coffee_name, price);
}

// INSERT query
String query1 = "insert into coffee (coffee_name, price) values ('Tajmahal', 950)";

// execute insert
Statement st1 = dbConnection.createStatement();
st1.executeUpdate(query1);

// close
st1.close();
st.close();
dbConnection.close();

}
catch (Exception e) {
System.err.println("Got an exception!");
System.err.println(e.getMessage());
}
}
}
