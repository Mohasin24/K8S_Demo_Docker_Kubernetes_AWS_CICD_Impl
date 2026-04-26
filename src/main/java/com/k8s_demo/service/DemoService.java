package com.k8s_demo.service;

import com.k8s_demo.entity.User;

public interface DemoService {

    User save(User user);

    User getUserById(long userId);
}
