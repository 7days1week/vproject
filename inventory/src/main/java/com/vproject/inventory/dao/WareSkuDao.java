package com.vproject.inventory.dao;

import com.vproject.inventory.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:49:16
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
