package com.yi.demo04;

import com.yi.demo02.UserService;
import com.yi.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);//设置要代理的对象
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
