package com.bizi.sleep;

import cn.hutool.core.date.DateUtil;
import com.bizi.sleep.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class SpringbootdemoApplicationTests {
	//private static final Logger log = LoggerFactory.getLogger(SpringbootdemoApplicationTests.class);
	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		System.out.println("测试中文");
		System.out.println(DateUtil.format(new Date(), "yyyy年MM月dd日"));
		System.out.println(userService.findAll());

		// 需要输出的日志位置
		log.info("日志信息1");
		log.error("日志信息2");
	}


}
