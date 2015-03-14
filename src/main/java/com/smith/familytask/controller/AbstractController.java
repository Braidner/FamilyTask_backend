package com.smith.familytask.controller;

import com.smith.familytask.model.User;
import com.smith.familytask.service.CurrentUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author smith
 */
public class AbstractController {

    @Autowired
    public CurrentUserService currentUserService;

    public User getCurrentUser() {
        return currentUserService.getCurrentUser();
    }
}
