package com.example.springboot_3_1_1.service;

import com.example.springboot_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUserById(int id);

}
