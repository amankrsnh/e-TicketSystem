/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aman.dao;

import com.aman.dbutil.DBConnection;
import com.aman.pojo.Events;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class EventDao 
{
    public static ArrayList<Events> searchEvents(String city) throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from events where city=?");
        ps.setString(1, city);
        ResultSet rs=ps.executeQuery();
        ArrayList<Events> data=new ArrayList<>();
        Events evt;
        while(rs.next())
        {
            evt=new Events();
            evt.setName(rs.getString(1));
            evt.setCity(rs.getString(2));
            evt.setState(rs.getString(3));
            evt.setCountry(rs.getString(4));
            evt.setTime(rs.getString(5));
            evt.setVenue(rs.getString(6));
            evt.setCostperseat(rs.getDouble(7));
            evt.setAvailableseat(rs.getInt(8));
            evt.setTotalseat(rs.getInt(9));
            evt.setImgname(rs.getString(10));
            evt.setImage(rs.getBlob(11));            
            data.add(evt);
        }
        return data;
    }
    public static boolean addEvent(Events event,String filename) throws SQLException,FileNotFoundException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into events values(?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, event.getName());
        ps.setString(2, event.getCity());
        ps.setString(3, event.getState());
        ps.setString(4, event.getCountry());
        ps.setString(5, event.getTime());
        ps.setString(6, event.getVenue());
        ps.setDouble(7, event.getCostperseat());
        ps.setInt(8, event.getAvailableseat());
        ps.setInt(9, event.getTotalseat());
        File f= new File(filename);
	FileInputStream fin = new FileInputStream(filename);
	ps.setString(10, filename);
	ps.setBinaryStream(11,fin,(int)f.length());
        int ans=ps.executeUpdate();
        System.out.println(ans);
        return ans==1;
    }
    public static boolean checkEvent(String evtname) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from events where name=?");
        ps.setString(1, evtname);
        int ans=ps.executeUpdate();
        return ans==1;
    }
    public static boolean removeEvent(String evtname) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from events where name=?");
        ps.setString(1, evtname);
        int ans=ps.executeUpdate();
        return ans!=0;
    }
    public static Events getEvent(String name) throws SQLException
    {
        Events ev=null;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from events where name=?");
        ps.setString(1, name);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            ev=new Events();
            ev.setName(rs.getString(1));
            ev.setCity(rs.getString(2));
            ev.setState(rs.getString(3));
            ev.setCountry(rs.getString(4));
            ev.setTime(rs.getString(5));
            ev.setVenue(rs.getString(6));
            ev.setCostperseat(rs.getDouble(7));
            ev.setAvailableseat(rs.getInt(8));
            ev.setTotalseat(rs.getInt(9));
            ev.setImgname(rs.getString(10));
            ev.setImage(rs.getBlob(11));
        }
        return ev;
    }
}
