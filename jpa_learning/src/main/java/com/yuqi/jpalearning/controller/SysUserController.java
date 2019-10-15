package com.yuqi.jpalearning.controller;

import com.yuqi.jpalearning.aux.ResponseResult;
import com.yuqi.jpalearning.enumclass.ResponseCode;
import com.yuqi.jpalearning.model.SysUser;
import com.yuqi.jpalearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 17:05
 **/
@RestController
@RequestMapping(value = "/user")
public class SysUserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseResult<List<SysUser>> getAllUser() {
        List<SysUser> users = userService.getAll();

        return new ResponseResult<List<SysUser>>(users,
                ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage());
    }


    @RequestMapping(value = "/allWithXML", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseResult<List<SysUser>> getAllUserAsXml() {
        List<SysUser> users = userService.getAll();

        return new ResponseResult<List<SysUser>>(users,
                ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage());
    }
}
