package com.logistics.LogisticsTracker.userPackage.repository;

import com.logistics.LogisticsTracker.userPackage.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,  Long> {

}
