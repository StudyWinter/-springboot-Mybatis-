package com.example.mysqlmybatis.mapper;

import com.example.mysqlmybatis.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //实现写入，用SQL语句
    @Insert("insert into user (userName,passWord) values (#{userName},#{passWord})")

    //抽象方法将获得的数据写入到数据库中
    void addUser(User user);
}
