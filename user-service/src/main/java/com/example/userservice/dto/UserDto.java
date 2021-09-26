package com.example.userservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto { //중간단계 이동 사용
    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createAt;
    private String encryptedPwd;
}
