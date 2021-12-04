package com.vproject.member.dao;

import com.vproject.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:51:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
