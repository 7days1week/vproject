package com.vproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author enjoysoft
 * @email enjoysoft@enjoysoft.com
 * @date 2021-11-28 19:44:03
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

