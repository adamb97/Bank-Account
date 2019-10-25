package com.adam;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

//constructors

    public VipCustomer() {
        this("defaultName", 1000, "default@email.com");
    }


    public VipCustomer(String n, int c) {
        this(n, c, "default@email.com");
    }



    public VipCustomer(String n, int c, String em) {
        this.name = n;
        this.creditLimit = c;
        this.emailAddress = em;
    }


    //getters


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
