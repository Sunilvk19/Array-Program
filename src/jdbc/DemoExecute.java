package jdbc;

import java.sql.*;

public class DemoExecute {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_db", "root", "code");
        Statement statement = con.createStatement();
//        String qry = "insert into student value(4,'rama',79)";
//        boolean sta = statement.execute(qry);
        boolean sta = statement.execute("select * from student");
        if(sta){
            ResultSet res = statement.getResultSet();
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                int marks = res.getInt("marks");
                System.out.println("Student Id: "+id+", name: "+name+", marks: "+marks);
            }
        }
        con.close();
        statement.close();
    }
}
