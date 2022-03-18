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
        // return getUsers() results from ApiService Interface to get Users List
        return apiService.getUsers();
    }

    public void generateRandomUser() {
        // use generateRandomUser() method from ApiService Interface to generate Random Users in Users List
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // use deleteUser() method from ApiService Interface to delete selected user
        apiService.deleteUser(user);
    }
}
