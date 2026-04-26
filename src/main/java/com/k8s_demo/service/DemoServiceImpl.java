package com.k8s_demo.service;

import com.k8s_demo.entity.User;
import com.k8s_demo.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    private final Repo repo;

    @Autowired
    public DemoServiceImpl(Repo repo){
        this.repo=repo;
    }

    @Override
    public User save(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(long userId) {
        return repo.findById(userId).get();
    }
}
