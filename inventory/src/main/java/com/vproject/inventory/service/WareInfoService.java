package com.vproject.inventory.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.inventory.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:49:16
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

