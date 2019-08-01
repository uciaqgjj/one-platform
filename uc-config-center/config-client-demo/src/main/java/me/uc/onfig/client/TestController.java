package me.uc.onfig.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

	@Value("${timeout:200}")
	private Integer timeout;

	@GetMapping("echo")
	public String echo() {
		return "hello, uc";
	}

	@GetMapping("timeout")
	public String timeout() {
		return String.format("timeout: %d", timeout);
	}
}
