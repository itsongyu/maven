package com.tianmao.dao.base;

public interface BaseDao<T> {

    T findByID(int id);

    T deletByID(int id);

    void save(T t);

    void update(T t);

}
