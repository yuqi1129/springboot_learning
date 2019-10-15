package com.yuqi.jpalearning.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description
 * @time 15/10/19 10:08
 **/
@Data
@TableName(value = "sys_permission")
public class SysPermission implements Serializable {
    /**
     * 自定id,主要供前端展示权限列表分类排序使用.
     */
    @TableId(value = "id", type = IdType.INPUT)
    @NotNull(message = "id should not null")
    private Integer id;

    /**
     * 归属菜单,前端判断并展示菜单使用,
     */
    @TableField(value = "menu_code")
    @NotNull(message = "menuCode should not null")
    private String menuCode;

    /**
     * 菜单的中文释义
     */
    @TableField(value = "menu_name")
    @Length(max = 100, min = 2)
    private String menuName;

    /**
     * 权限的代码/通配符,对应代码中@RequiresPermissions 的value
     */
    @TableField(value = "permission_code")
    private String permissionCode;

    /**
     * 本权限的中文释义
     */
    @TableField(value = "permission_name")
    private String permissionName;

    /**
     * 是否本菜单必选权限, 1.必选 2非必选 通常是"列表"权限是必选
     */
    @TableField(value = "required_permission")
    private Boolean requiredPermission;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_MENU_CODE = "menu_code";

    public static final String COL_MENU_NAME = "menu_name";

    public static final String COL_PERMISSION_CODE = "permission_code";

    public static final String COL_PERMISSION_NAME = "permission_name";

    public static final String COL_REQUIRED_PERMISSION = "required_permission";
}