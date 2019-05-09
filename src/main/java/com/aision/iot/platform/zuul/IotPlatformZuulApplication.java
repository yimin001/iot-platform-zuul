package com.aision.iot.platform.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yim
 * @description 启动类
 * @date 2019/4/26
 */
@SpringBootApplication
@EnableZuulProxy
@ServletComponentScan
public class IotPlatformZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotPlatformZuulApplication.class, args);
    }

}
