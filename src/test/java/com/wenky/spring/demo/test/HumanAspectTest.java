package com.wenky.spring.demo.test;

import com.wenky.starter.custom.aspect.bean.Boy;
import com.wenky.starter.custom.aspect.bean.Human;
import com.wenky.starter.custom.aspect.bean.Man;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: spring-boot-starter-custom-demo
 * @description:
 * @author: wenky
 * @email: huwenqi@panda-fintech.com
 * @create: 2021-03-03 09:39
 */
@SpringBootTest
class HumanAspectTest {
  @Autowired private Boy boy;
  @Autowired private Human human;
  @Autowired private Man man;

  @Test
  public void test() {
    System.out.println("---------------------This is a Human.");
    human.say("hello!");
    human.jump();
    human.run();

    System.out.println("---------------------This is a Man.");
    man.say("hello!");
    man.jump();
    man.run();

    System.out.println("---------------------This is a Boy.");
    boy.say("hello!");
    boy.jump();
    boy.run();
  }
}
