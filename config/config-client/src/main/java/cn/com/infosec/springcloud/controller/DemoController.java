package cn.com.infosec.springcloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Controller
public class DemoController {

	@Value("${jdbc.driverClassName}")
	private String jdbcDriverClassName;

	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Value("${jdbc.username}")
	private String jdbcUsername;

	@Value("${jdbc.password}")
	private String jdbcPassword;

	@ResponseBody
	@RequestMapping("demo.do")
	public Map<String, Object> demoController() {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("jdbc.driverClassName", jdbcDriverClassName);
		map.put("jdbc.url", jdbcUrl);
		map.put("jdbc.username", jdbcUsername);
		map.put("jdbc.password", jdbcPassword);

		return map;
	}
}
