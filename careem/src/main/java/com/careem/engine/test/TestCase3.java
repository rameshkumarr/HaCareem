package com.careem.engine.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.careem.engine.web.service.BookingWebService;

public class TestCase3 {

	@Autowired
	private BookingWebService bookingWebService;

	@Test
	public void test() {
		bookingWebService.getDriver(3L, 12.936802, 77.600909);
	}
}