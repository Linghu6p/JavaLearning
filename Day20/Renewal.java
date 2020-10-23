package Day20;

import java.sql.*;

public class Renewal extends Conn {
    static Connection con;
    static PreparedStatement sql;
    static ResultSet rel;

    public static void main(String[] args) {
        Renewal c = new Renewal();
        con = c.getConnection();
        try {
            sql = con.prepareStatement("select * from sites");
            rel = sql.executeQuery();
            System.out.println("之前的数据：");

            while (rel.next()) {
                String id = rel.getString(3);
                String name = rel.getString(1);
                String url = rel.getString(2);
                System.out.println(id + " " + name + " " + url);
            }

            sql = con.prepareStatement("insert into sites (name,url) values(?,?)");
            sql.setString(1, "唐六");
            sql.setString(2, "2012-2-1");
            sql.executeUpdate();
            System.out.println();


            sql = con.prepareStatement("update sites set id = ? where name = ?");
            sql.setString(2, "唐六");
            sql.setInt(1, 6);
            sql.executeUpdate();

            sql = con.prepareStatement("delete from sites where name = ?");
            sql.setObject(1,"唐六");
            sql.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
