package com.zjgsu.cyd.baseweb.web.sys_notice.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zjgsu.cyd.baseweb.web.sys_notice.entity.SysNotice;

public interface SysNoticeService extends IService<SysNotice> {


    SysNotice getOne();
}
