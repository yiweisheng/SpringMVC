package com.yi.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.yi.pojo.User"/>
//@Component 组件
@Component
//@Scope("singleton")   单例模式
//@Scope("prototype")   原型模式
@Scope("prototype")
public class User {
    //相当于<property name="name" value="易玮晟"/>
//    @Value("易玮晟")
    public String name;

    @Value("易玮晟")
    public void setName(String name) {
        this.name = name;
    }
}
