package com.vproject.coupon.dao;

import com.vproject.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 18:10:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
