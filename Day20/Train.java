package Day20;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 指定查找*/
public class Train extends Conn {

    static Connection con;
    static Statement sql;
    static ResultSet res;

    public static void main(String[] args) {
        Train C = new Train();
        con = C.getConnection();
        try {
            sql = con.createStatement();
            res = sql.executeQuery("select * from sites where name like '张%'");
            while (res.next()) {
                String id = res.getString("id");
                String name = res.getString("name");
                String url = res.getString("url");
                System.out.println(id + " " + name + " " + url);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
