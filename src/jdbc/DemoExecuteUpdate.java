package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoExecuteUpdate {
    public static void main(String[] args) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_db", "root", "code");
        Statement statement = con.createStatement();
        int result = statement.executeUpdate("update student set marks=67 where id=4");
        if(result > 0){
            System.out.println("Updated successfully "+result);
        }else {
            System.out.println("no rows effected");
        }

        con.close();
        statement.close();
    }
}
