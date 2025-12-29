package com.zjgsu.cyd.baseweb.web.live_house.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zjgsu.cyd.baseweb.web.live_house.entity.LiveHouse;
import com.zjgsu.cyd.baseweb.web.live_house.mapper.LiveHouseMapper;
import com.zjgsu.cyd.baseweb.web.live_house.service.LiveHouseService;
import org.springframework.stereotype.Service;

@Service
public class LiveHouseServiceImpl extends ServiceImpl<LiveHouseMapper, LiveHouse> implements LiveHouseService {
}
