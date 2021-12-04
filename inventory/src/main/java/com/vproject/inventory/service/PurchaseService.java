package com.vproject.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.inventory.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:49:15
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

