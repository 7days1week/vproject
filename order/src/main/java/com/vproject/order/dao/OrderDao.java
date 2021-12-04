package com.vproject.order.dao;

import com.vproject.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:53:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
