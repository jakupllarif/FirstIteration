package sourceCodes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class login extends HttpServlet

{
String url= "jdbc:mysql://localhost:3306/";

String dbName ="javadb"

String driver ="com.mysql.jdbc.Driver";

String userName="root"

String password="toor";



protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter output = response.getWriter();

        String username;
        String password;
        Connection connection;
        Statement statement;
        ResultSet result;

        try {

            name = request.getParameter("username");
            pass = request.getParameter("password");


            Class.forName(driver);
            connection= (Connection) DriverManager.getConnection(url + dbName, userName, password);
            Stmt = conn.createStatement();
            PreparedStatement st = conn.prepareStatement("select * from users where username=? && password=?");
            result = st.executeQuery();
	
UserBean userBean = new UserBean();
	
List<UserBean> listOfUserBean = new ArrayList<UserBean>();

            if (result.next()) {
                userBean.setUserID(rs.getString("userid"));
                userBean.setUserName(rs.getString("username"));
             
            }

            listOfUserBean.add(userBean);

            response.sendRedirect("index.jsp");
            request.setAttribute("userlist", listOfUserBean);
	

            if (userBean.getUserID().equals("")) {
                response.sendRedirect("login.jsp");
            }

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            out.close();
        }
    }
	
request.setAttribute("userlist", listOfUserBean);
response.sendRedirect("index.jsp");








}