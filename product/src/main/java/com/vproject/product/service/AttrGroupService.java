package com.vproject.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author enjoysoft
 * @email enjoysoft@enjoysoft.com
 * @date 2021-11-28 19:44:03
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

