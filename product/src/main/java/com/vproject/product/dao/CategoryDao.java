package com.vproject.product.dao;

import com.vproject.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author enjoysoft
 * @email enjoysoft@enjoysoft.com
 * @date 2021-11-28 19:44:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
