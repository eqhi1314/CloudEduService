package com.cloudedu.serviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 微服务-注册中心master（Eureka Server）
 *
 * @Desc 提供服务注册和发现的能力
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceEurekaApplication.class, args);

        System.out.println("注册中心-master启动成功，请接着启动注册中心-slave1");
    }
}
