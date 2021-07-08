/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aman.dao;

import com.aman.dbutil.DBConnection;
import com.aman.pojo.User;
import com.aman.pojo.UserDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class UserDetailsDao {

    public static boolean addDetails(UserDetails udetails) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        conn.setAutoCommit(false);
        PreparedStatement ps=conn.prepareStatement("Insert into userdetails values(?,?,?,TO_DATE(?,'dd/mm/yyyy'),?,?,?,?,?)");
        ps.setString(1, udetails.getUsername());
        ps.setString(2, udetails.getPassword());
        ps.setString(3, udetails.getEmailId());
        ps.setString(4, udetails.getDateOfBirth());
        ps.setString(5, udetails.getGender());
        ps.setLong(6, udetails.getMobileNum());
        ps.setString(7, udetails.getAddress());
        ps.setString(8, udetails.getCompanyName());
        ps.setString(9, udetails.getName());
        int ans1=ps.executeUpdate();
        ps=conn.prepareStatement("Insert into users values(?,?,?)");
        ps.setString(1, udetails.getUsername());
        ps.setString(2, udetails.getPassword());
        ps.setString(3, udetails.getUserType());
        int ans2=ps.executeUpdate();
        conn.commit();
        return ans1==1 && ans2==1;
    }
    public static ArrayList<Object[]> getUsers(String listinfo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement s=conn.createStatement();
        String comp="companyname is null";
        if(listinfo.equalsIgnoreCase("agent"))
            comp="companyname is not null";
        ResultSet rs=s.executeQuery("Select * from userdetails where "+comp);
        ArrayList<Object[]> data=new ArrayList<>();
        while(rs.next())
        {
            UserDetails u=new UserDetails();
            u.setUsername(rs.getString(1));
            u.setPassword(rs.getString(2));
            u.setEmailId(rs.getString(3));
            u.setDateOfBirth(rs.getString(4));
            u.setGender(rs.getString(5));
            u.setMobileNum(Long.parseLong(rs.getString(6)));
            u.setAddress(rs.getString(7));
            u.setCompanyName(rs.getString(8));
            u.setName(rs.getString(9));
            Object []o={u.getUsername(),u.getName(),u.getPassword(),u.getEmailId(),u.getDateOfBirth(),u.getGender(),u.getMobileNum(),u.getAddress(),u.getCompanyName()};
            data.add(o);
        }
        return data;
    }
}
