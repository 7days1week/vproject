package com.vproject.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 18:10:56
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

