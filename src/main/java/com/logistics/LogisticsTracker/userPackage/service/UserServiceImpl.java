package com.logistics.LogisticsTracker.userPackage.service;

import com.logistics.LogisticsTracker.userPackage.entity.User;
import com.logistics.LogisticsTracker.userPackage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }


    public UserServiceImpl(){};

    @Override
    public List getAllUsers() {
        List list = new ArrayList();
        repository.findAll().forEach(e->list.add(e));
        return list;
    }

    @Override
    public User getUserById(Long id) {
        User user = repository.findById(id).get();
        return user;
    }

    @Override
    public boolean saveUser(User user) {

        try {
            repository.save(user);
            return true;
        } catch (Exception ex){
            return false;
        }

    }

    @Override
    public boolean delateUserById(Long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception ex){
            return false;
        }
    }
}
