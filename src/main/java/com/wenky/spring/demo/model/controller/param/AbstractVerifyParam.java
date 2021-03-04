package com.wenky.spring.demo.model.controller.param;


import com.wenky.starter.custom.aspect.controller.verify.VerifyInterface;

/**
 * @program: spring-boot-starter-custom-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2021-03-03 18:04
 */
public abstract class AbstractVerifyParam implements VerifyInterface {
  @Override
  public boolean verify() {
    return Boolean.TRUE.equals(verify);
  }

  private Boolean verify;

  public Boolean getVerify() {
    return verify;
  }

  public void setVerify(Boolean verify) {
    this.verify = verify;
  }
}
