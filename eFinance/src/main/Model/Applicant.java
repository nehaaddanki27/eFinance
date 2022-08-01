package com.example.efinance.model;

import javax.persistance.*;
import java.io.Serializable;


public class Applicant implements Serializable
{
    private String name;

    private String userName;

    private String password;

    private String dateOfBirth;

    private String emailAddress;

    private String mailingAddress;

    private String socialSecurityNumber;

    private int creditScore;

    private String driversLicenseNumber;

    private String phoneNumber;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getMailingAddress()
    {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress)
    {
        this.mailingAddress = mailingAddress;
    }

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getCreditScore()
    {
        return creditScore;
    }

    public void setCreditScore(int creditScore)
    {
        this.creditScore = creditScore;
    }

    public String getDriversLicenseNumber()
    {
        return driversLicenseNumber;
    }

    public void setDriversLicenseNumber(String driversLicenseNumber)
    {
        this.driversLicenseNumber = driversLicenseNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}
