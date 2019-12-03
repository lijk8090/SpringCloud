package cn.com.infosec.springcloud.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HystrixCommandService {

	@HystrixCommand(fallbackMethod = "defaultFallback")
	public int divController(int dividend, int divisor) {
		return dividend / divisor;
	}

	public int defaultFallback(int dividend, int divisor) {
		return dividend / 1;
	}
}
