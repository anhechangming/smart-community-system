package com.zjgsu.cyd.baseweb.web.house_list.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjgsu.cyd.baseweb.web.house_list.entity.HouseList;
import com.zjgsu.cyd.baseweb.web.house_list.entity.ListParm;

public interface HouseListService extends IService<HouseList> {
    IPage<HouseList> getList(ListParm parm);
}
