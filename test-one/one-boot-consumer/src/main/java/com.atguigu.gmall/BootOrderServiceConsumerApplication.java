package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
//@ImportResource(locations="classpath:provider.xml")
public class BootOrderServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
	}
}
