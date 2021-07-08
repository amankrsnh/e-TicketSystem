package com.aman.dao;
import com.aman.dbutil.DBConnection;
import com.aman.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UserDao {
    public static boolean validateUser(User user) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where username=? and password =? and usertype =?");
        ps.setString(1, user.getUsername());
        //System.out.println(user.getUsername());
        ps.setString(2, user.getPassword());
        //System.out.println(user.getPassword());
        ps.setString(3, user.getUsertype().toLowerCase());
        //System.out.println(user.getUsertype());
        int ans=ps.executeUpdate();
        //System.out.println(ans);
        return ans==1;
    }

    public static boolean checkUsername(String username) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where username=?");
        ps.setString(1, username);
        int ans=ps.executeUpdate();
        return ans==1;
    }
}
