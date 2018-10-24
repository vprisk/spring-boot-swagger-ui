package com.example.demo.bean;

import io.swagger.annotations.ApiModelProperty;
public class Student {
    @ApiModelProperty(value = "姓名",required = true)
    private  String name;

    @ApiModelProperty(value = "年龄",required = true)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
