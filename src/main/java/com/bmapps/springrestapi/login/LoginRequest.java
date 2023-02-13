package com.bmapps.springrestapi.login;


/**
 * Represents the request for the login endpoint.
 * Contains the email and password fields which are used to authenticate a user.
 * @author Brian Morillo
 */
public class LoginRequest {
    /**
     * The email field is used to identify the user making the login request.
     */
    private String email;

    /**
     * The password field is used to authenticate the user.
     */
    private String password;

    /**
     * Returns the email of the user making the login request.
     * @return the email of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the password of the user making the login request.
     * @return the password of the user.
     */
    public String getPassword() {
        return password;
    }

}
