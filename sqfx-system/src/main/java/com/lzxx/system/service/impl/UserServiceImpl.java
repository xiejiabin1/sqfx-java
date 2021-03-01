package com.lzxx.system.service.impl;

import com.lzxx.system.model.entity.User;
import com.lzxx.system.mapper.UserMapper;
import com.lzxx.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 微信用户信息表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2021-03-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
