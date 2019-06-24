package com.nocodingnomoney.mapper;

import com.nocodingnomoney.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "age", column = "age"),
            @Result(property = "name", column = "name")
    })
    List<User> getAll();
}
