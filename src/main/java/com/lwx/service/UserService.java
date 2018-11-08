package com.lwx.service;

import com.lwx.base.BaseService;
import com.lwx.dao.UserMapper;
import com.lwx.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * By:刘文旭 ~ https://blog.csdn.net/qq_40414738
 * Date：2018/11/8 17:58 .
 */
@Service
public class UserService extends BaseService<User> {

    @Resource
    private UserMapper userMapper;
}
