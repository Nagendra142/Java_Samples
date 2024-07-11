package JDBC;
import java.sql.*;

public class sample {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3307/hello";
        String username="root";
        String password="Nagendra142";
        String query="select name from student where id=3";
      Class.forName("com.mysql.jdbc.Driver"); //for register the drivers.
      Connection con=DriverManager.getConnection(url, username, password);
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery(query);
      rs.next();
      String name=rs.getString("name");
      System.out.println(name);
      st.close();
      con.close();
    }
}
