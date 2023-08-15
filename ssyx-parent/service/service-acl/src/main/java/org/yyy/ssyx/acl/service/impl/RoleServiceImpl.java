package org.yyy.ssyx.acl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.yyy.ssyx.acl.mapper.RoleMapper;
import org.yyy.ssyx.acl.service.RoleService;
import org.yyy.ssyx.model.acl.Role;
import org.yyy.ssyx.vo.acl.RoleQueryVo;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    @Override
    public IPage<Role> selectRolePage(Page<Role> pageParam, RoleQueryVo roleQueryVo) {

        String roleName = roleQueryVo.getRoleName();

        LambdaQueryWrapper<Role> wrapper = new LambdaQueryWrapper<>();

        if(!StringUtils.isEmpty(roleName)) {
            wrapper.like(Role::getRoleName, roleName);
        }

        IPage<Role> pageModel = baseMapper.selectPage(pageParam, wrapper);

        return pageModel;
    }
}
