package com.example.danielpalacio.standardfind;

public class Profile {
    private String fName;
    private String lName;
    private int id;
    private String password;
    public Profile(String firstName,String lastName,int identification,String _password, Network pool){
        fName = firstName;
        lName = lastName;
        id = identification;
        password = _password;
    }

    public String getFullName(){
        return fName + " " + lName;
    }
    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    public int getId(){
        return id;
    }
    public Network getPool(){
        return null;
    }
    public void setfName(String name){
        fName = name;
    }
    public void setlName(String name){
        lName = name;
    }




}
