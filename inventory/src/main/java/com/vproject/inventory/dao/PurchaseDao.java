package com.vproject.inventory.dao;

import com.vproject.inventory.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:49:15
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
