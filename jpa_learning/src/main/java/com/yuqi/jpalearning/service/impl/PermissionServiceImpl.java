package com.yuqi.jpalearning.service.impl;

import com.yuqi.jpalearning.mapper.SysPermissionMapper;
import com.yuqi.jpalearning.model.SysPermission;
import com.yuqi.jpalearning.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 15/10/19 10:11
 **/
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private SysPermissionMapper mapper;


    public void savePermission(SysPermission permission) {
        mapper.insert(permission);
    }
}
