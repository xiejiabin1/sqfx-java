package com.lzxx.system.service.impl;

import com.lzxx.system.model.entity.Identity;
import com.lzxx.system.mapper.IdentityMapper;
import com.lzxx.system.service.IIdentityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 身份信息表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-02-24
 */
@Service
public class IdentityServiceImpl extends ServiceImpl<IdentityMapper, Identity> implements IIdentityService {

}
