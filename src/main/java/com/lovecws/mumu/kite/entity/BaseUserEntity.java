package com.lovecws.mumu.kite.entity;

import java.util.Date;

/**
 * @author babymm
 * @version 1.0-SNAPSHOT
 * @Description: 用户实体对象
 * @date 2018-01-11 09:54:
 */
public class BaseUserEntity {
    private String username;
    private String userpassword;
    private int age;
    private String sex;
    private long createDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "BaseUserEntity{" +
                "username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
