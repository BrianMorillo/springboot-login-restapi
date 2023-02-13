package com.bmapps.springrestapi.login;


import com.bmapps.springrestapi.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * LoginService class provides logic for handling user authentication.
 * It contains methods for verifying user credentials.
 * @author Brian Morillo
 */
@Service
public class LoginService {

    /**
     * List containing list of users
     */
    private final List<User> fakeUserList = new ArrayList<>();

    /**
     * LoginService constructor
     */
    public LoginService() {
        // Fake data that would normally be populated by a database.
        fakeUserList.add(new User(1, "John", "Doe",
                "john.doe@example.com", "password1"));
        fakeUserList.add(new User(2, "Jane", "Doe",
                "jane.doe@example.com", "password2"));
    }


    /**
     * This method is responsible for verifying the user credentials.
     *
     * @param loginRequest the LoginRequest object containing the username and password
     * @return the User object if the credentials are correct
     */
    public User login(LoginRequest loginRequest) {
        for (User user : fakeUserList) {
            if (user.email().equals(loginRequest.getEmail()) &&
                    user.password().equals(loginRequest.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
