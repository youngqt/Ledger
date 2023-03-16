package com.tiger.ledger.domain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tiger.ledger.domain.model.entity.User;

/**
 * @author yangqt
 * @since 2023/3/16
 */
public interface UserService extends IService<User> {
    User getByUsername(String username);
}
