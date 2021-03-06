package cn.com.infosec.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.com.infosec.springcloud.service.impl.DemoServiceImpl;

@FeignClient(name = "spring-cloud-producer", fallback = DemoServiceImpl.class)
public interface DemoService {

	@RequestMapping(value = "login.do")
	public List<Object> loginController(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password);

}
