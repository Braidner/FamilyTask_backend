package com.smith.familytask.controller.rest;

import com.smith.familytask.model.User;
import com.smith.familytask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smith / 09.03.2015.
 */
@RestController
@RequestMapping("rest/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("createUser")
    @ResponseBody
    public User createUser(@RequestBody User user) {
        userRepository.saveUser(user);
        return user;
    }
}
