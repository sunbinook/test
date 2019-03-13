package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private int userId;
    private String userName;
    private String userPsw;
    private Date createTime;
}
