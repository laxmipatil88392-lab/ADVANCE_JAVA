<%@ page import="java.sql.*" %>
<html>
<body>

<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String salary = request.getParameter("salary");

Connection con = null;
PreparedStatement ps;
ResultSet rs;

try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","");

// Insert record
String query = "INSERT INTO Emp VALUES (?,?,?)";
ps = con.prepareStatement(query);
ps.setInt(1, Integer.parseInt(empno));
ps.setString(2, empname);
ps.setInt(3, Integer.parseInt(salary));
ps.executeUpdate();

// Display report
out.println("<h2>Salary Report</h2>");
out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

int total = 0;

Statement st = con.createStatement();
rs = st.executeQuery("SELECT * FROM Emp");

while(rs.next()) {
out.println("Emp_No : " + rs.getInt("Emp_NO") + "<br>");
out.println("Emp_Name : " + rs.getString("Emp_Name") + "<br>");
out.println("Basic : " + rs.getInt("Basicsalary") + "<br>");
out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br>");

total += rs.getInt("Basicsalary");
}

out.println("<br>Grand Salary : " + total);

}
catch(Exception e){
out.println(e);
}
%>

</body>
</html>
