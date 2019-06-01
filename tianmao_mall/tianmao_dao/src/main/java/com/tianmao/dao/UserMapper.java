package com.tianmao.dao;
import com.tianmao.dao.base.BaseDao;
import com.tianmao.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseDao<User> {
    User findByString(@Param("0") String s1, @Param("1")String s2);
    User findByID(int id);
}
