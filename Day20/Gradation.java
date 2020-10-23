package Day20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Gradation extends Conn {
    static Connection con;
    static Statement sql;//查询语句
    static ResultSet res;//查询结果

    public static void main(String[] args) {
        Gradation c = new Gradation();
        con = c.getConnection();
        try {
            sql = con.createStatement();
            res = sql.executeQuery("select * from sites");

            while (res.next()) {
                String name = res.getString("name");
                String cell = res.getString("url");
                System.out.println(name + " " + cell);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

