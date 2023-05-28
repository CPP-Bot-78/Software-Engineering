package com.example.savethem;

public class loggedInUser {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String livingLocation;
    protected String email;
    protected String otherInfo;

    public loggedInUser(int id, String firstName, String lastName, String livingLocation, String email, String otherInfo)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.otherInfo=otherInfo;
        this.livingLocation=livingLocation;
    }

    public String getUserEmail()
    {return email;}

    public int getUserId()
    {return id;}

    public String getUserFirstName()
    {return firstName;}

    public String getUserLastName()
    {return lastName;}
}
