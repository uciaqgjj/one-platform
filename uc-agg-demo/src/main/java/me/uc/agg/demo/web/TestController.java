package me.uc.agg.demo.web;

import me.uc.common.core.api.BaseResponse;
import me.uc.common.core.api.ResultCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author uc
 * @description TODO
 * @date 2019/8/5
 */
@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping("echo")
	public String echo() {
		return "agg-demo";
	}

	@GetMapping("testMissingParameter")
	public BaseResponse testMissingParameter(@RequestParam("msg") String msg) {
		return BaseResponse.builder().code(ResultCode.PARAM_MISS).build();
	}
}
