package jdbc;

import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args)  {
        String qry = "insert into students value(2,'sunil',23)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_db", "root", "code");
            Statement sta = con.createStatement();
            int ab = sta.executeUpdate(qry);
            System.out.println(ab+" Query inserted Successfully");
            ResultSet re = sta.executeQuery("select *  from students");
            while (re.next()) {
                int id = re.getInt("id");
                String name = re.getString("name");
                int age = re.getInt("age");
                System.out.println("Id: "+id+", "+"Name: " + name + ", " + "Age: " + age);
            }
            con.close();
            sta.close();
            re.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
