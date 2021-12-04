package com.vproject.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.inventory.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:49:16
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

