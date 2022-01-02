package com.company;

import java.util.Date;

public class User {
    private int id;
    private String login;
    private String email;
    private String password;
    private Date dateOfRegistration;
    private boolean isBlocked;

    public User() {
    }

    public User(int id, String username, String email, String password, Date dateOfRegistration, boolean isBlocked) {
        this.id = id;
        this.login = username;
        this.email = email;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
        this.isBlocked = isBlocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
