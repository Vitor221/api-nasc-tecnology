package com.nasctecnology.subscribe.services;

import com.nasctecnology.subscribe.domain.UserSubscribe;
import com.nasctecnology.subscribe.repositories.UserSubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSubscribeService {

    @Autowired
    private UserSubscribeRepository repository;

    public UserSubscribe create(UserSubscribe userSubscribe) {
        return repository.save(userSubscribe);
    }

    public List<UserSubscribe> findAll() {
        return repository.findAll();
    }
}
