package com.yuqi.jpalearning.service;

import com.yuqi.jpalearning.model.SysUser;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 16:58
 **/
public interface UserService {

    List<SysUser> getAll();
}
