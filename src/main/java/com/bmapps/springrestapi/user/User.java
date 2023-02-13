package com.bmapps.springrestapi.user;

/**
 * @author Brian Morillo
 * Represents a model class for an user
 */
public record User(Integer id,
                   String firstName,
                   String lastName,
                   String email,
                   String password) { }


