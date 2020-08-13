package com.codegym.model;

import java.io.Serializable;

/*
This is class is required for creating a response containing the JWT to be returned to the user.
 */
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = 8126390500968810118L;
    private final String jwtToken;

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getJwtToken() {
        return jwtToken;
    }
}
