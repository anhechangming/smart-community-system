package com.zjgsu.cyd.baseweb.web.sys_notice.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjgsu.cyd.baseweb.web.sys_notice.entity.SysNotice;
import com.zjgsu.cyd.baseweb.web.sys_notice.mapper.SysNoticeMapper;
import com.zjgsu.cyd.baseweb.web.sys_notice.service.SysNoticeService;
import org.springframework.stereotype.Service;

@Service
public class SysNoticeServiceImpl extends ServiceImpl<SysNoticeMapper, SysNotice> implements SysNoticeService {

    @Override
    public SysNotice getOne() {
        //构造查询条件
        QueryWrapper<SysNotice> query = new QueryWrapper<>();
        query.orderByDesc("create_time");
        return this.baseMapper.getOne(query);

    }
}
