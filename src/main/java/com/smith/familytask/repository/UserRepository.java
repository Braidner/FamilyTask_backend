package com.smith.familytask.repository;

import org.springframework.stereotype.Repository;
import com.smith.familytask.model.User;

import javax.transaction.Transactional;

/**
 * {@link Repository} to access {@link User}
 *
 * @author Nick Smith
 */
public interface UserRepository {

    void saveUser(User user);
}
