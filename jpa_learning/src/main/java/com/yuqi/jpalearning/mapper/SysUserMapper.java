package com.yuqi.jpalearning.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuqi.jpalearning.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 16:46
 **/
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> getAll();
}