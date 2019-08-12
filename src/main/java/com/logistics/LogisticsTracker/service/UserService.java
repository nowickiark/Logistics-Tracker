package com.logistics.LogisticsTracker.service;

import com.logistics.LogisticsTracker.model.User;

import java.util.List;

public interface UserService {

    public List getAllUsers();
    public User getUserById(Long id);
    public boolean saveUser(User user);
    public boolean delateUserById(Long id);


}
