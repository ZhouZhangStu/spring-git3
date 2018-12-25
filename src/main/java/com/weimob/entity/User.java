package com.weimob.entity;

import lombok.Data;

@Data
public class User {
    private String id;
    private String userName;
    private String passWord;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
