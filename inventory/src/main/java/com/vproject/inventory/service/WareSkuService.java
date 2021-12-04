package com.vproject.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.inventory.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:49:16
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

