package com.hao.chapter5.controller;

import com.hao.chapter5.entity.User;
import com.hao.chapter5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/users")
public class SpringJdbcController {

    private final UserService userService;

    @Autowired
    public SpringJdbcController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> queryUsers() {
        // 查询所有用户
        return userService.queryUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // 根据主键ID查询
        return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    public int delUser(@PathVariable Long id) {
        // 根据主键ID删除用户信息
        return userService.delUser(id);
    }

    @PostMapping
    public int addUser(@RequestBody User user) {
        // 添加用户
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public int editUser(@PathVariable Long id, @RequestBody User user) {
        // 根据主键ID修改用户信息
        return userService.editUser(id, user);
    }
}
