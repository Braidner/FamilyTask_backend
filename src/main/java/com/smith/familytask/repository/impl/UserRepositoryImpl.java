package com.smith.familytask.repository.impl;

import com.smith.familytask.model.User;
import com.smith.familytask.repository.UserRepository;
import com.smith.familytask.utils.HibernateSupport;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by smith / 09.03.2015.
 */
@Repository("userRepository")
@Transactional
public class UserRepositoryImpl extends HibernateSupport implements UserRepository {

    @Override
    public void saveUser(User user) {
        save(user);
    }
}
