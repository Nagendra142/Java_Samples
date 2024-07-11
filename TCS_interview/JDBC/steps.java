package TCS_interview.JDBC;
// 7  steps
// 1)import the packages
// 2)a)load the drivers, or this we have to download the jar file 
// 2)b)register the drivers 
// 3)connect the table( Connection interface thats why we use implimentation class method.)
// 4)create stmt (three type, Statements, PreparedStatement, Callable statement);
// 5)executes the stmt (execute the statement and store the results in Resultset)
// 6)process the stmt (retrive the data)
// 7)close connection 

import java.sql.*;
public class steps {
    public static void main(String... args) throws Exception{
        String url="jdbc:mysql://localhost:3007/database_name";
        String user="root";
        String password="Nagendra142";
        String query="select * from student where name=nag";
        Class.forName("com.mysql.Driver.sql");
        Connection con=DriverManager.getConnection("","","");
        Statement st=con.CreateStatement();
        Resultset store=st.executeQuery(query);
        while(st.next()){
            System.out.println(st.getInt(1)+" "+st.getString(2));
        }
        st.close();
        con.close();

    }
}
