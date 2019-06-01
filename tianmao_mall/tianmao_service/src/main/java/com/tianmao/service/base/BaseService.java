package com.tianmao.service.base;

public interface BaseService<T> {

    T findById(int id);

    T deletByID(int id);

    void save(T t);

    void update(T t);

}
