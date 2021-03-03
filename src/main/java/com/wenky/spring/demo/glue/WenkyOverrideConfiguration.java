package com.wenky.spring.demo.glue;

import com.wenky.starter.custom.bean.aoverride.OverrideConfiguration;
import com.wenky.starter.custom.util.LoggerUtils;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2020-12-04 22:29
 */
@Component
public class WenkyOverrideConfiguration extends OverrideConfiguration {
  WenkyOverrideConfiguration() {
    super();
    LoggerUtils.construct();
  }
}
