package com.tianmao.service.base;

import com.tianmao.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<T> implements BaseService<T>{

    //统一管理dao
    @Autowired
    protected UserMapper userMapper;

    @Override
    public T findById(int id) {
        return null;
    }

    @Override
    public T deletByID(int id) {
        return null;
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void update(T t) {

    }
}
