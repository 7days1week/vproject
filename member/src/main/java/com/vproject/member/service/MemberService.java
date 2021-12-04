package com.vproject.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:51:01
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

