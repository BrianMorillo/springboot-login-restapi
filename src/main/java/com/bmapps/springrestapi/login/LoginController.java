package com.bmapps.springrestapi.login;

import com.bmapps.springrestapi.user.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * The LoginController class handles login requests.
 *
 * @author Brian Morillo
 */
@RestController
@RequestMapping("/api/auth")
public class LoginController {

    /**
     * Login handling service.
     */
    private final LoginService loginService;

    /**
     * LoginController Constructor
     * @param loginService LoginService instance
     */
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * Endpoint to handle login requests.
     * @param loginRequest LoginRequest object
     * @return LoginResponse which represents the result of the endpoint call
     */
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        User user = loginService.login(loginRequest);

        if (user == null) {
            return ResponseEntity.badRequest().body(
                    new LoginResponse("Invalid credentials", 400, null));
        }

        return ResponseEntity.ok(
                new LoginResponse("Login successful", 200, generateJWT(user)));
    }

    /**
     * Creates a JSON Web Token for the user to log in
     * @param user to login
     * @return JSON Web Token String
     */
    private String generateJWT(User user) {
        // Implementation to generate a JSON Web Token (JWT) for the user
        return Jwts.builder()
                .setSubject(user.email())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secret")
                .compact();
    }
}
