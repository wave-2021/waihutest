package com.tjpu.waihutest.outboundcall.dao;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderStatusDao {
    int updateOrderStatus(String caseId);
    Long queryTaskid(String caseId);
    String queryWorkOrderType(String caseId);
}
