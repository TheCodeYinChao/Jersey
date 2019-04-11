package com.qiyuan.demo.comfig;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("webapi")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {

        /**
         * 注册类有多种方式
         *
         * 1 直接用类加载机制进行加载
         * 2 通过配置扫描包的方式进行加载
         */
        this.packages("com.qiyuan.demo.controller");
//        register(IndexController.class);
    }
}
