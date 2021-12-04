package com.vproject.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.inventory.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:49:16
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

