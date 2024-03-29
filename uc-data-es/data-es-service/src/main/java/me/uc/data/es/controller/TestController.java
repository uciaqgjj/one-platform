package me.uc.data.es.controller;

import me.uc.common.core.api.BaseResponse;
import me.uc.common.core.api.ResultCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("testMissingParameter")
	public BaseResponse testMissingParameter(@RequestParam("msg") String msg) {
		return BaseResponse.builder().code(ResultCode.PARAM_MISS).build();
	}

	@GetMapping("testResponse")
	public BaseResponse<String> testResponse() {
		return BaseResponse.<String>builder().data("hello").build();
	}


}
