package com.wenky.spring.demo.runner;

import com.wenky.starter.custom.holder.SpringContextHolder;
import com.wenky.starter.custom.util.LoggerUtils;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @program: spring-boot-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2020-12-04 18:51
 */
@Order(2)
@Component
public class Runner2 implements ApplicationRunner {
  @Override
  public void run(ApplicationArguments args) throws Exception {
    // 打印所有项目中的接口信息
    // requestMappingInfo();
  }

  private void requestMappingInfo() {
    RequestMappingHandlerMapping mapping =
        SpringContextHolder.getBean(RequestMappingHandlerMapping.class);
    mapping.getHandlerMethods().entrySet().stream()
        .forEach(
            single ->
                LoggerUtils.info(
                    single.getKey().getPatternsCondition().getPatterns().stream()
                        .findFirst()
                        .get()));
  }
}
