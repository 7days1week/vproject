package com.vproject.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 18:10:56
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

