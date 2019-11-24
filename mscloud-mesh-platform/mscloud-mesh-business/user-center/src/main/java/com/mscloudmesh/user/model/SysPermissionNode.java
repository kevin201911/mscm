package com.mscloudmesh.user.model;

import com.mscloudmesh.common.model.SysPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author kevin
 * @date 2019-11-09
 */
public class SysPermissionNode extends SysPermission {
    @Getter
    @Setter
    private List<SysPermissionNode> children;
}
