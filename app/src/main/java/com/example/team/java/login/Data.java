package com.example.team.java.login;

public class Data {
    private String name;
    private String email;

    public Data(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Data (String name, String email){
        this.name = name;
        this.email = email;
    }
}
