package com.github.boonya.shiro.base.dao;


import java.util.List;

import com.github.boonya.shiro.base.entity.Resource;

/**
 * <p>Resource: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface ResourceDao {

    public Resource createResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(Long resourceId);
    public Resource findOne(Long resourceId);
    public List<Resource> findAllCategrory();
    public List<Resource> findAll();

}
