package com.smith.familytask.repository.impl;

import com.smith.familytask.model.User;
import com.smith.familytask.repository.UserRepository;
import com.smith.familytask.utils.HibernateSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by smith / 09.03.2015.
 */
@Transactional
@Repository("userRepository")
public class UserRepositoryImpl extends HibernateSupport implements UserRepository {

    @Override
    public void saveUser(User user) {
        save(user);
    }

    @Override
    @Nullable
    public User findUser(@NotNull String login) {
        return (User) openSession().createQuery("from User where login = :login")
                .setParameter("login", login)
                .uniqueResult();
    }
}
