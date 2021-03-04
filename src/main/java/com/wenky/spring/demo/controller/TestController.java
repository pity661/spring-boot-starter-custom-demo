package com.wenky.spring.demo.controller;

import com.wenky.spring.demo.model.controller.param.UnderlineToCamelParam;
import com.wenky.spring.demo.model.controller.param.VerifyParam;
import com.wenky.starter.custom.aspect.controller.verify.NotVerify;
import com.wenky.starter.custom.config.annotation.LineToCamel;
import com.wenky.starter.custom.util.LoggerUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2020-12-04 15:48
 */
@RestController
public class TestController {

  @RequestMapping("/check")
  public ResponseEntity<String> check() {
    int a = 1 / 0;
    return ResponseEntity.ok("ok");
  }

  @RequestMapping("/param")
  public ResponseEntity<String> underlineToCamel(@LineToCamel UnderlineToCamelParam param) {
    LoggerUtils.info(param);
    return ResponseEntity.ok("ok");
  }

  @RequestMapping("/not-verify-param")
  public ResponseEntity<String> notVerifyParam(@NotVerify @LineToCamel VerifyParam param) {
    LoggerUtils.info(param);
    return ResponseEntity.ok("ok");
  }

  @RequestMapping("/verify-param")
  public ResponseEntity<String> verifyParam(@LineToCamel VerifyParam param) {
    LoggerUtils.info(param);
    return ResponseEntity.ok("ok");
  }
}
