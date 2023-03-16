package com.tiger.ledger.domain.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tiger.ledger.domain.model.entity.User;
import com.tiger.ledger.domain.repository.mapper.UserMapper;
import com.tiger.ledger.domain.service.UserService;

/**
 * @author yangqt
 * @since 2023/3/16
 */
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public User getByUsername(String username) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername,username).last("limit 1");
        return getOne(wrapper);
    }
}
