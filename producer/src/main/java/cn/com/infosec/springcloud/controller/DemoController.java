package cn.com.infosec.springcloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping(value = "login.do")
	public List<Object> loginController(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		List<Object> list = new ArrayList<Object>();
		Map<String, Object> map = new HashMap<String, Object>();

		list.add("spring-cloud-producer");

		map.put("username", username);
		map.put("password", password);

		list.add(map);

		return list;
	}
}
