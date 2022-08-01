package com.example.eFinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account
{
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private long dateOfBirth;

    @Column(name = "mailing_address")
    private String mailingAddress;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "social_security_number")
    private int ssn;

    @Column(name = "credit_score")
    private int creditScore;

    @Column(name = "drivers_license")
    private long driversLicense;

    @Column(name = "phone_number")
    private long phoneNumber;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
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

    public long getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMailingAddress()
    {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress)
    {
        this.mailingAddress = mailingAddress;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public int getSsn()
    {
        return ssn;
    }

    public void setSsn(int ssn)
    {
        this.ssn = ssn;
    }

    public int getCreditScore()
    {
        return creditScore;
    }

    public void setCreditScore(int creditScore)
    {
        this.creditScore = creditScore;
    }

    public long getDriversLicense()
    {
        return driversLicense;
    }

    public void setDriversLicense(long driversLicense)
    {
        this.driversLicense = driversLicense;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}

