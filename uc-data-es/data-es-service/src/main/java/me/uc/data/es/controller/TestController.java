package me.uc.data.es.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author uc
 * @description TODO
 * @date 2019/8/2
 */
@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping("echo")
	public String echo() {
		return "data-es";
	}
}
