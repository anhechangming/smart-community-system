package com.zjgsu.cyd.baseweb.web.house_unit.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class HouseUnitParm implements Serializable {
    private String buildNme;
    private String unitName;
    private Long currentPage;
    private Long pageSize;
}