package com.vproject.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:53:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

