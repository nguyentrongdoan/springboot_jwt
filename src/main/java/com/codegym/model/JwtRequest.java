package com.codegym.model;

import java.io.Serializable;

/*
This class is required for storing the username and password we recieve from the client.
* */

public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 8511896682975460647L;
    private String username;
    private String password;

    public JwtRequest() {
    }

    public JwtRequest(String username, String password) {
//        this.username = username;
//        this.password = password;
        this.setUsername(username);
        this.setPassword(password);
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
}
