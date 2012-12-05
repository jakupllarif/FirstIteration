<%@ page import = "java.sql.*" %>
<%@ page import = "java.io.*" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<title>New User Registration</title>
</head>
<body>




<%
                response.setContentType("text/html");
                String firstName = request.getParameter("firstname");
                String middleName = request.getParameter("middlename");
				String lastName = request.getParameter("lastname");
				String email = request.getParameter("email");
				String userName = request.getParameter("username");
				String password = request.getParameter("password");
				String address = request.getParameter("address");
				String city = request.getParameter("city");
				String state = request.getParameter("state");
				String zipcode = request.getParameter("zipcode");
                
                Class.forName("com.mysql.jdbc.Driver");
               Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","toor");
               Statement stmt = con.createStatement();
               String register = "INSERT INTO USERS(firstName, address, username, password, email, city, state, zipcode, lastName, middleName, datetimelastlogin, wrongtries, lockedout)VALUES(firstName,address,userName,password,email,city,state,zipcode,lastName,middleName,CURRENT_TIMESTAMP, '0','0')";
 
                 PreparedStatement ps=con.prepareStatement(register);
               // ResultSet res = stmt.execute(register);
				
				//res.setContentType ("text/html");
				
		//		PrintWriter output = res.getWriter();
		
		         //     out.println("Successfully registered with the following details:firstName+middleName+lastName");
												
												
										ps.executeUpdate();		
		
        //                        try
         //                       {
                                           
												
                                
	//							}
		//						catch(ClassNotFoundException e)
			//					{
				//				out.println("Couldn't load database driver: " + e.getMessage());
					//				}
						//		catch(SQLException e){
							//	out.println("SQLException caught: " + e.getMessage());
								//						}
														
														
														
														
									//					finally
													
											//			{
														con.close();
														
														//TEAM: change this to wherever it's stored in your own folder
														response.sendRedirect("/FirstIteration/home.jsp");
														
												//		}
														
														
														
								
			  
			  
			  


%>

</body>
</html>