package com.log.LogisticsSpring.Models;

public class User {
    private String username;
    private String password;
    private String email;
    public String getUsername() {
        return username;
    }
    public String getEmail() {return email;}
    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "username: " + username + "\npassword: " + password;
    }
}
