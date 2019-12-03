package cn.com.infosec.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.infosec.springcloud.service.DemoService;

@Controller
public class DemoController {

	@Autowired
	DemoService demoService;

	@ResponseBody
	@RequestMapping(value = "login.do")
	public List<Object> loginController(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		return demoService.loginController(username, password);
	}
}
