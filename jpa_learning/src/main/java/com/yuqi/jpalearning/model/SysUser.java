package com.yuqi.jpalearning.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 14/10/19 16:46
 **/
@TableName(value = "sys_user")
@XmlRootElement
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    private String nickname;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Integer roleId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 是否有效  1有效  2无效
     */
    @TableField(value = "delete_status")
    private String deleteStatus;


    public SysUser(Integer id, String username, String password,
                   String nickname, Integer roleId, Date createTime,
                   Date updateTime, String deleteStatus) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.roleId = roleId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteStatus = deleteStatus;
    }

    public SysUser() {
    }

    @XmlElement
    public Integer getId() {
        return id;
    }

    @XmlElement
    public String getUsername() {
        return username;
    }

    @XmlElement
    public String getPassword() {
        return password;
    }

    @XmlElement
    public String getNickname() {
        return nickname;
    }

    @XmlElement
    public Integer getRoleId() {
        return roleId;
    }

    @XmlElement
    public Date getCreateTime() {
        return createTime;
    }

    @XmlElement
    public Date getUpdateTime() {
        return updateTime;
    }

    @XmlElement
    public String getDeleteStatus() {
        return deleteStatus;
    }

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_DELETE_STATUS = "delete_status";
}