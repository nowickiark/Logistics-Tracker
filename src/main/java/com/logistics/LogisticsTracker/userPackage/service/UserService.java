package com.logistics.LogisticsTracker.userPackage.service;

import com.logistics.LogisticsTracker.userPackage.entity.User;

import java.util.List;

public interface UserService {

    List getAllUsers();
    User getUserById(Long id);
    boolean saveUser(User user);
    boolean delateUserById(Long id);


}
