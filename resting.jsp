<%@ page import = "java.sql.*"  %>

<%
                response.setContentType("text/html");
				String user = session.getAttribute("username").toString();
                String pwd = request.getParameter("pass").toString();
                
                if (pwd =="")
                out.println("You have to enter a password");
                else	
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
               Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
               Statement stmt = con.createStatement();
               String query = "update USERS set password = '" +pwd+"' where username = '"+user+"' ";
                stmt.executeUpdate(query);
				 response.sendRedirect("/aaaaaa/login.html");
                               
                }catch(Exception exp)
                {
                out.println("error::"+exp);
               
              }
                
                	
               
               
%>

