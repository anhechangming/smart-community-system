package com.zjgsu.cyd.baseweb.web.role.entity;


import com.zjgsu.cyd.baseweb.web.menu.entity.Menu;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RolePermissionVo {
    //当前登录系统用户的菜单数据
    List<Menu> listmenu = new ArrayList<>();
    //角色原来分配的菜单
    private Object[] checkList;
}