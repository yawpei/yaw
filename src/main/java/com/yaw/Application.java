package com.yaw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yawpei on 2016/12/21.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // TODO: 2016/12/21 移除banner打印
        SpringApplication.run(Application.class, args);
    }
}
