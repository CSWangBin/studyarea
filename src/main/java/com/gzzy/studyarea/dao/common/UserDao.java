package com.gzzy.studyarea.dao.common;

import com.gzzy.studyarea.entity.common.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from t_user")
    List<User> querUser();


}
