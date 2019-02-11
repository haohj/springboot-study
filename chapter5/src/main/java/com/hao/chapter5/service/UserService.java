package com.hao.chapter5.service;

import com.hao.chapter5.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryUsers();

    User getUser(Long id);

    int addUser(User user);

    int editUser(Long id, User user);

    int delUser(Long id);

}
