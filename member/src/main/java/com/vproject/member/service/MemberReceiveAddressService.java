package com.vproject.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vproject.common.utils.PageUtils;
import com.vproject.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author Hector
 * @email zheng@michaels.com
 * @date 2021-12-04 17:51:02
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

