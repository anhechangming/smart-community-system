package com.zjgsu.cyd.baseweb.web.menu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjgsu.cyd.baseweb.web.menu.entity.Menu;

import java.util.List;

public interface MenuService extends IService<Menu> {
    //上级菜单查询
    List<Menu> getParentList();
    //查询菜单列表
    List<Menu> getList();
    //根据用户id查询权限
    List<Menu> getMenuByUserId(Long userId);
    //根据业主的id查询菜单
    List<Menu> getMenuByUserIdForLiveUser(Long userId);
    //根据角色id查询原来的权限
    List<Menu> getMenuByRoleId(Long roleId);
}