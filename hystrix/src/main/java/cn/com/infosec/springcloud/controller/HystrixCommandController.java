package cn.com.infosec.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.infosec.springcloud.service.HystrixCommandService;

@Controller
public class HystrixCommandController {
	@Autowired
	HystrixCommandService hystrixCommandService;

	@ResponseBody
	@RequestMapping(value = "div.do")
	public int divController(@RequestParam(value = "dividend") int dividend, @RequestParam(value = "divisor") int divisor) {

		return hystrixCommandService.divController(dividend, divisor);
	}
}
