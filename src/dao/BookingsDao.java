/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.dao;

import com.aman.dbutil.DBConnection;
import com.aman.pojo.Bookings;
import com.aman.pojo.Events;
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
 * @author Aman Kumar Singh
 */
public class BookingsDao 
{

    public static boolean updateSeat(Events event) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Update events set availableseat=? where name=?");
        ps.setInt(1, (event.getAvailableseat()-1));
        ps.setString(2, event.getName());
        int ans=ps.executeUpdate();
        return ans==1;
    }

    public static boolean addBooking(Bookings booking) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into bookings values(?,?,?,?,?,?,TO_DATE(?,'dd/mm/yyyy'),TO_DATE(?,'dd/mm/yyyy'),?,?,?)");
        ps.setString(1,booking.getUsername());
        ps.setString(2,booking.getName());
        ps.setLong(3,booking.getMobileno());
        ps.setString(4,booking.getEmailid());
        ps.setString(5,booking.getAddress());
        ps.setString(6,booking.getEventName());
        ps.setString(7,booking.getDateofbooking());
        ps.setString(8,booking.getDateofevent());
        ps.setString(9,booking.getTime());
        ps.setDouble(10,booking.getAmount());
        ps.setString(11,booking.getMode());
        int ans=ps.executeUpdate();
        return ans==1;
    }
    
    public static ArrayList<Object[]> getBookings(User user) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement s=conn.createStatement();
        String query;
        if(user.getUsertype().equalsIgnoreCase("user"))
            query="Select * from bookings where username='"+user.getUsername()+"'";
        else
            query="Select * from bookings";
        ResultSet rs=s.executeQuery(query);
        ArrayList<Object[]> data=new ArrayList<>();
        while(rs.next())
        {
            Bookings u=new Bookings();
            u.setUsername(rs.getString(1));
            u.setName(rs.getString(2));
            u.setMobileno(Long.parseLong(rs.getString(3)));
            u.setEmailid(rs.getString(4));
            u.setAddress(rs.getString(5));
            u.setEventName(rs.getString(6));
            u.setDateofbooking(rs.getString(7));
            u.setDateofevent(rs.getString(8));
            u.setTime(rs.getString(9));
            u.setAmount(Double.parseDouble(rs.getString(10)));
            u.setMode(rs.getString(11));
            Object []o={u.getUsername(),u.getName(),u.getMobileno(),u.getEmailid(),u.getAddress(),u.getEventName(),u.getDateofbooking(),u.getDateofevent(),u.getTime(),u.getAmount(),u.getMode()};
            data.add(o);
        }
        return data;
    }
    
}
