package com.bizi.sleep;

import cn.hutool.core.date.DateUtil;
import com.bizi.sleep.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SpringbootdemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		System.out.println("测试中文");
		System.out.println(DateUtil.format(new Date(), "yyyy年MM月dd日"));
		System.out.println(userService.findAll());
	}


}
