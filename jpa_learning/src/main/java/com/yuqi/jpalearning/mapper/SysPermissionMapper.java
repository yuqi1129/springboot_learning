package com.yuqi.jpalearning.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuqi.jpalearning.model.SysPermission;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 15/10/19 10:08
 **/
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    List<SysPermission> getAll();
}