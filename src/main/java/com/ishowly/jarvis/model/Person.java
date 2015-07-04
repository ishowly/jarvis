package com.ishowly.jarvis.model;

import org.springframework.stereotype.Component;

/**
 * Created by zhangdongjie on 15-7-4.
 */
public class Person extends BaseEntity {
    //自增id
    private long id;
    //名称
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;
    //住址
    private String address;
    //家庭编号
    private int familyId;
    //家庭中的角色
    private int roleId;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public int getFamilyId() {
        return familyId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
