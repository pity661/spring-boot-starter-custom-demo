package com.wenky.spring.demo.model.controller.param;

/**
 * @program: spring-boot-starter-custom-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2021-03-03 10:31
 */
public class UnderlineToCamelParam {
  private Long appKey;
  private String appName;

  public Long getAppKey() {
    return appKey;
  }

  public void setAppKey(Long appKey) {
    this.appKey = appKey;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }
}
