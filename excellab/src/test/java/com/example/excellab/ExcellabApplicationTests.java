package com.example.excellab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class ExcellabApplicationTests {

	@Test
	void contextLoads() throws InterruptedException {
		HutoolExcelUtil.exp();
		Thread.sleep(3);
	}

}
