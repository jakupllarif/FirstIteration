<%@ page import = "java.sql.*" %>
<%
                response.setContentType("text/html");
                String user = request.getParameter("user");
                String email = request.getParameter("email");
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
               Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
               Statement stmt = con.createStatement();
               String query = "select * from USERS where username = '"+user+"' and email = '" +email+"'";
              
                ResultSet res = stmt.executeQuery(query);
                                if(res.next())
                                {
                                	response.sendRedirect("/aaaaaa/resting.html");
                                	session.setAttribute("username",user);
                                }
                                else
                                out.println("Invalid information");
                }catch(Exception exp)
                {
                out.println("error::"+exp);
  
                
              }
                

%>