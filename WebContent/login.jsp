<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>  


<%
String username=request.getParameter("un");

 
String pwd=request.getParameter("pwd"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection
("jdbc:mysql://localhost:3306/javadb","root","toor"); 
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("select * from users where username='"+username+"'"); 
if(rs.next()) 
{ 
if(rs.getString(2).equals(pwd)) 
{ 
out.println("Welcome"+username); 
out.println("Successful login");

} 
else 
{ 
out.println("Invalid Login.  Try again"); 
} 
} 
else 
%>






</body>
</html>