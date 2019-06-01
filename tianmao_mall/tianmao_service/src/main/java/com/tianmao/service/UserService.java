package com.tianmao.service;

import com.tianmao.pojo.User;
import com.tianmao.service.base.BaseService;
import org.springframework.stereotype.Service;

public interface UserService extends BaseService<User> {
    User findByString(String s1,String s2);
}
