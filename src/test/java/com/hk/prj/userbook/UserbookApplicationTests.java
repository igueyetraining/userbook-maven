package com.hk.prj.userbook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hk.prj.userbook.controller.UserController;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UserbookApplicationTests {

	@Autowired
	UserController userController;
	@Test
	void contextLoads() {
		assertThat(userController).isNotNull();
	}

}
