package com.bmapps.springrestapi.login;

/**
 * Represents the result immutable response of a login attempt.
 *
 * @author Brian Morillo
 */
public class LoginResponse {
    /**
     * The message returned after a successful login.
     */
    private String message;
    /**
     * The response's status code.
     */
    private int status;
    /**
     * The access token generated after a successful login.
     */
    private String accessToken;

    /**
     * contructor utilized to initialize a LoginResponse
     * @param message LoginResponse's message
     * @param status LoginResponse's status code
     * @param accessToken LoginResponse's generated accesstoken
     */
    public LoginResponse(String message, int status, String accessToken) {
        this.message = message;
        this.status = status;
        this.accessToken = accessToken;
    }

    /**
     * Returns the login request message.
     * @return login request message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Returns the login request status code.
     * @return login request status code.
     */
    public int getStatus() {
        return status;
    }

    /**
     * Returns the login request access token.
     * @return login request access token.
     */
    public String getAccessToken() {
        return accessToken;
    }

}
