package com.smith.familytask.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by smith on 09.03.2015.
 */
@Transactional
public abstract class HibernateSupport {

    @Autowired
    private SessionFactory sessionFactory;

    public Session openSession() {
        return sessionFactory.openSession();
    }

    public <T> T save(T model) {
        openSession().save(model);
        return model;
    }

//    public <T> T find(T model) {
//        openSession().get();
//    }
}
