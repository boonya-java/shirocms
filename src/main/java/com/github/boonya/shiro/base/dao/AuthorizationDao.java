package com.github.boonya.shiro.base.dao;


import java.util.List;

import com.github.boonya.shiro.base.entity.Authorization;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface AuthorizationDao {

    public Authorization createAuthorization(Authorization authorization);
    public Authorization updateAuthorization(Authorization authorization);
    public void deleteAuthorization(Long authorizationId);

    public Authorization findOne(Long authorizationId);
    public List<Authorization> findAll();

    public Authorization findByAppUser(Long appId, Long userId);
}
