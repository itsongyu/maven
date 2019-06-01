package com.tianmao.service;

import com.tianmao.pojo.User;
import com.tianmao.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Override
    public User findByString(String s1, String s2) {
        User u= userMapper.findByString(s1,s2);
        return u;
    }

    @Override
    public User findById(int id) {
        User u=userMapper.findByID(id);
        return u;
    }
}
