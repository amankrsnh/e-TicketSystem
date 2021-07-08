/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aman.pojo;

/**
 *
 * @author Aman Kumar Singh
 */
public class Bookings 
{
    private String username;
    private String name;
    private Long mobileno;
    private String emailid;
    private String address;
    private String eventName;
    private String dateofbooking;
    private String dateofevent;
    private String time;
    private double amount;
    private String mode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDateofbooking() {
        return dateofbooking;
    }

    public void setDateofbooking(String dateofbooking) {
        this.dateofbooking = dateofbooking;
    }

    public String getDateofevent() {
        return dateofevent;
    }

    public void setDateofevent(String dateofevent) {
        this.dateofevent = dateofevent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMode() {
        return mode;
    }

    @Override
    public String toString() {
        String s="Event Name: "+getEventName()+"\nDate Of Booking: "+getDateofbooking()+"\nDate Of Event: "+getDateofevent()+"\nTime OF Event: "+getTime()+"\nAmount Paid: "+getAmount()+"\nMode Of Payment: "+getMode();
        return s; //To change body of generated methods, choose Tools | Templates.
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
}
