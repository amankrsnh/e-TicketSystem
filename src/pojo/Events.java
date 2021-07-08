/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aman.pojo;

import java.sql.Blob;

/**
 *
 * @author vivek
 */
public class Events 
{
    private String name;
    private String city;
    private String state;
    private String country;
    private String time;
    private String venue;
    private String imgname;
    private Blob image;
    private double costperseat;
    private int availableseat;
    private int totalseat;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
    
    public String getCity() {
        return city;
    }

    public int getAvailableseat() {
        return availableseat;
    }

    public void setAvailableseat(int availableseat) {
        this.availableseat = availableseat;
    }

    public int getTotalseat() {
        return totalseat;
    }

    public void setTotalseat(int totalseat) {
        this.totalseat = totalseat;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public double getCostperseat() {
        return costperseat;
    }

    public void setCostperseat(double costperseat) {
        this.costperseat = costperseat;
    }
    
}
