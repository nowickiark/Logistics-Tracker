package com.logistics.LogisticsTracker.dao;

import com.logistics.LogisticsTracker.model.User;

import java.util.List;

public interface UserList {

    void addUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();

}
