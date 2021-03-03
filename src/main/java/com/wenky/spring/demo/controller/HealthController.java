package com.wenky.spring.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2020-12-07 16:20
 **/
// 自定义 HealthController 覆盖模版
//@RestController
public class HealthController {
    @RequestMapping("/health")
    public ResponseEntity<String> check() {
        int a = 1/0;
        return ResponseEntity.ok("ok");
    }
}
