package com.logistics.LogisticsTracker.userPackage.dao;

import com.logistics.LogisticsTracker.userPackage.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserListImpl implements  UserList {


    private List<User> users = new ArrayList<>();


    public UserListImpl(){
        User user1 = new User();
        user1.setFirstName("Jan");
        user1.setLastName("Kowalski");
        user1.setId(1L);

        User user2 = new User();
        user2.setFirstName("Marian");
        user2.setLastName("Nowak");
        user2.setId(2L);

        users.add(user1);
        users.add(user2);


    }


    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUserById(Long id) {

        User foundUser = users.stream().filter(a->a.getId()== id).findFirst().get();
        return foundUser;

    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
