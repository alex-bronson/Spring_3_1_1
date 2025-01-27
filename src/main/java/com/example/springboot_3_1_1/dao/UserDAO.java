package com.example.springboot_3_1_1.dao;

import com.example.springboot_3_1_1.model.User;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface UserDAO {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
    public User getUserById(int id);

}
