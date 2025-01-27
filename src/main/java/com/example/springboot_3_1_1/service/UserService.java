package com.example.springboot_3_1_1.service;

import com.example.springboot_3_1_1.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public User getUserById(int id);

}
