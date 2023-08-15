package org.yyy.ssyx.acl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.yyy.ssyx.model.acl.Role;
import org.yyy.ssyx.vo.acl.RoleQueryVo;

public interface RoleService extends IService<Role> {

    IPage<Role> selectRolePage(Page<Role> pageParam, RoleQueryVo roleQueryVo);
}
