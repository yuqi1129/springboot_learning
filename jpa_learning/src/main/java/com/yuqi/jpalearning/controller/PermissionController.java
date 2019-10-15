package com.yuqi.jpalearning.controller;

import com.yuqi.jpalearning.aux.ResponseResult;
import com.yuqi.jpalearning.enumclass.ResponseCode;
import com.yuqi.jpalearning.model.SysPermission;
import com.yuqi.jpalearning.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 15/10/19 10:14
 **/
@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    /**
     * localhost:8080/permission/add?id=1&menuCode=rt&menuName=a
     * 区别
     *
     *
     * 另外 validate要和里面的注解一起使用才有效
     * @param permission
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @CachePut(value = "all", key = "#permission")
    public ResponseResult<SysPermission> addPermission(@Validated SysPermission permission) {
        permissionService.savePermission(permission);
        return new ResponseResult<SysPermission>(permission,
                ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage());
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @Cacheable(value = "all")
    public ResponseResult<List<SysPermission>> getAll() {
        List<SysPermission> permissions = permissionService.getAll();
        return new ResponseResult<List<SysPermission>>(permissions,
                ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage());
    }
}
