package com.mxy.demo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private  String info;
    public void printInfo(){
        System.out.println("ID:"+this.id+";Name:"+
                this.name+";age:"+this.age+
                ";info:"+this.info+".");
    }
}
