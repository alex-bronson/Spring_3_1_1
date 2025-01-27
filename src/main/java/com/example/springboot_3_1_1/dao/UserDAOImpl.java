package com.example.springboot_3_1_1.dao;

import com.example.springboot_3_1_1.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        List<User> userList = entityManager.createQuery("select u from User u ", User.class)
                .getResultList();
        return userList;
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }

    @Override
    public void updateUser(User user) {
        User user1 = entityManager.find(User.class, user.getId());
        if (user1 != null) {
            entityManager.merge(user);
        }
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }
}
