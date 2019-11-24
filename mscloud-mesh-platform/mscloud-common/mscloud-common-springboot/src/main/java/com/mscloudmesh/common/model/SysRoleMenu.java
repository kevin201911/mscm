package com.mscloudmesh.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author kevin
 * @date 2019-11-09
 */
@Data
@TableName("sys_role_menu")
public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("role_id")
    private Long roleId;

    @TableField("menu_id")
    private Long menuId;




    @Override
    public String toString() {
        return "SysRoleMenu{" +
        ", roleId=" + roleId +
        ", menuId=" + menuId +
        "}";
    }
}
