package com.smith.familytask.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author smith
 */
public class Role implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return null;
    }
}
