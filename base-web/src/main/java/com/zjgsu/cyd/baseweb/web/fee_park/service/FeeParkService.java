package com.zjgsu.cyd.baseweb.web.fee_park.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjgsu.cyd.baseweb.web.fee_park.entity.FeePark;
import com.zjgsu.cyd.baseweb.web.fee_park.entity.FeeParkParm;

public interface FeeParkService extends IService<FeePark> {
    IPage<FeePark> getList(FeeParkParm parkParm);
}
