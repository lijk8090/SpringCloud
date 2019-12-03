package cn.com.infosec.springcloud.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.infosec.springcloud.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public List<Object> loginController(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {

		List<Object> list = new ArrayList<Object>();
		Map<String, Object> map = new HashMap<String, Object>();

		list.add("spring-cloud-hystrix");

		map.put("username", username);
		map.put("password", password);

		list.add(map);

		return list;
	}
}
