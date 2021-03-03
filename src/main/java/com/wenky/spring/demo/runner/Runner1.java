package com.wenky.spring.demo.runner;

import com.wenky.spring.demo.glue.WenkyOverrideConfiguration;
import com.wenky.starter.custom.bean.aoverride.OverrideConfiguration;
import com.wenky.starter.custom.bean.auto.AutoProperties;
import com.wenky.starter.custom.frame.mail.MailTemplate;
import com.wenky.starter.custom.holder.SpringContextHolder;
import com.wenky.starter.custom.util.LoggerUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2020-12-04 18:50
 */
@Order(1)
@Component
public class Runner1 implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
    // 打印autoConfiguration自动注入bean信息
    // autoConfigurationInfo();

    // 打印mail信息,并发送测试邮件
//    testEmailSend();
  }

  private void testEmailSend() {
    // mailTemplate bean是否注入
    LoggerUtils.info(
            String.format("MailTemplate:[%s]", SpringContextHolder.contains("mailTemplate")));
    MailTemplate mailTemplate = SpringContextHolder.getBean(MailTemplate.class);
    LoggerUtils.info(String.format("MailTemplate:[%s]", mailTemplate));
    mailTemplate.sendEmailTemplate();
  }

  private void autoConfigurationInfo() {
    LoggerUtils.info(SpringContextHolder.getBean(AutoProperties.class).toString());
    LoggerUtils.info(
        String.format(
            "WenkyOverrideConfiguration:[%s]",
            SpringContextHolder.getBean(OverrideConfiguration.class)
                instanceof WenkyOverrideConfiguration));
    LoggerUtils.info(
        String.format(
            "EnableProperties:[%s]",
            SpringContextHolder.contains(
                "com.wenky.starter.custom.bean.delay.enable.EnableProperties")));
    LoggerUtils.info(
        String.format(
            "ImportProperties:[%s]",
            SpringContextHolder.contains(
                "com.wenky.starter.custom.bean.delay.aimport.ImportProperties")));
  }
}
