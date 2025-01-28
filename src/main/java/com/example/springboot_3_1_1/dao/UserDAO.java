package com.example.springboot_3_1_1.dao;

import com.example.springboot_3_1_1.model.User;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface UserDAO {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    User getUserById(int id);

}
