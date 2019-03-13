package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void findUsers() throws Exception {
        List<User> list=userDao.findUsers();
        Assert.assertTrue(list.size()>0);
    }
    @Test
    public void findUserById() throws Exception{
        User user=userDao.findUserById(1);
        Assert.assertNotNull(user);
    }

}