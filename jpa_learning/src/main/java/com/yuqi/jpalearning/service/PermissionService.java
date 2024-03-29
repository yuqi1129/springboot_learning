package com.yuqi.jpalearning.service;

import com.yuqi.jpalearning.model.SysPermission;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 15/10/19 10:10
 **/
public interface PermissionService {

    void savePermission(SysPermission permission);

    List<SysPermission> getAll();
}
