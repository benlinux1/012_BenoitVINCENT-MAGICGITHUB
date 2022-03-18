package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        // TODO: A modifier
        // return getUsers method from ApiService to get Users List
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // TODO: A modifier
        // return generateRandomUsers method from ApiService to generate Random Users in Users List
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier
        // return deleteUser method from ApiService to delete selected user
        apiService.deleteUser(user);
    }
}
