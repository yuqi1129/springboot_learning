package com.yuqi.jpalearning.service.impl;

import com.yuqi.jpalearning.mapper.SysUserMapper;
import com.yuqi.jpalearning.model.SysUser;
import com.yuqi.jpalearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @descriptioxn
 * @time 14/10/19 16:59
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper userMapper;

    public List<SysUser> getAll() {
        return userMapper.getAll();
    }
}
