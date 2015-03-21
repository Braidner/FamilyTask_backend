package com.smith.familytask.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import org.springframework.stereotype.Component;

/**
 * @author smith
 */
@Component("hibernateMapper")
public class HibernateAwareObjectMapper extends ObjectMapper {
    public HibernateAwareObjectMapper() {
        super();
        registerModule(new Hibernate4Module());
    }
}
