<%@ page import = "java.sql.*" %>
<%
                response.setContentType("text/html");
                String user = request.getParameter("user");
                String pwd = request.getParameter("pwd");
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
               Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
               Statement stmt = con.createStatement();
               String query = "select * from users where username = '"+user+"' and password = '" +pwd+"'";
                ResultSet res = stmt.executeQuery(query);
                                if(res.next())
                                {
                                                out.println("welcome  "+user);
                                }
                                else
                                out.println("Invalid Username/Password");
                }catch(Exception exp)
                {
                out.println("error::"+exp);
  

              }


%>