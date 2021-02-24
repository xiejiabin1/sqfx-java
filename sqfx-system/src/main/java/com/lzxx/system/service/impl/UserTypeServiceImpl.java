package com.lzxx.system.service.impl;

import com.lzxx.system.model.entity.UserType;
import com.lzxx.system.mapper.UserTypeMapper;
import com.lzxx.system.service.IUserTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户类型表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-02-24
 */
@Service
public class UserTypeServiceImpl extends ServiceImpl<UserTypeMapper, UserType> implements IUserTypeService {

}
