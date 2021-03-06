package com.appsdevelopblog.app.ws.io.repository;

import com.appsdevelopblog.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
    UserEntity findUserByEmail(String email);

    UserEntity findUserByUserId(String userId);


}

