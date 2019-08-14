package com.logistics.LogisticsTracker.userPackage.dao;

import com.logistics.LogisticsTracker.userPackage.entity.User;

import java.util.List;

public interface UserList {

    void addUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();

}
