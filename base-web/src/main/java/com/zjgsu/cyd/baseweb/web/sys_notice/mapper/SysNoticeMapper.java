package com.zjgsu.cyd.baseweb.web.sys_notice.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjgsu.cyd.baseweb.web.sys_notice.entity.SysNotice;

public interface SysNoticeMapper extends BaseMapper<SysNotice> {
    SysNotice getOne(QueryWrapper<SysNotice> query);
}
