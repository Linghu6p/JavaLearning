package Day20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prep extends Conn {
    static Connection con;
    static PreparedStatement sql;
    static ResultSet res;

    public static void main(String[] args) {
        Prep c = new Prep();
        con = c.getConnection();
        try {
            sql = con.prepareStatement("select * from sites where name like ?");
            sql.setObject(1,"张%");
            //sql.setInt(1,1 );//意思是从左向右数第一个通配符 通配符的值为1
            res = sql.executeQuery();
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
