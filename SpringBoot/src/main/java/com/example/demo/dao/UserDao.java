package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserDao {
    @Select("select * from t_user")
    public List<User> findUsers();

    @Select("select * from t_user where user_id=#{userId}")
   public User findUserById(int userId);

   public User findUserByName(String userName);


}
