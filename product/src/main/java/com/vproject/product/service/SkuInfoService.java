package com.vproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author enjoysoft
 * @email enjoysoft@enjoysoft.com
 * @date 2021-11-28 19:44:03
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

