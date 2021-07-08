/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aman.pojo;

/**
 *
 * @author vivek
 */
public class UserDetails 
{
    private String username;
    private String password;
    private String emailId;
    private String dateOfBirth;
    private String gender;
    private long mobileNum;
    private String address;
    private String companyName;
    private String name;
    private String userType;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() 
    {
        String s="User Type : "+getUserType()+"\nName : "+getName()+"\nUsername : "+getUsername()+"\nEmail Id : "+getEmailId()+"\nDate Of Birth : "+getDateOfBirth()+"\nGender : "+getGender()+"\nMobile Number : "+getMobileNum()+"\nAddress : "+getAddress()+"\nCompany Name : "+getCompanyName();
        return s;
    }
    
}
