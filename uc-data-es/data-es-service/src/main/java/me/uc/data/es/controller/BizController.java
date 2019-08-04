package me.uc.data.es.controller;

import me.uc.common.core.api.BaseResponse;
import me.uc.data.es.dto.BookIndexRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.Valid;

/**
 * @author uc
 * @description TODO
 * @date 2019/8/5
 */
@RestControllerAdvice
@RequestMapping("/v1/biz")
public class BizController {

	@PostMapping("testIndexBook")
	public BaseResponse<String> testIndexBook(@Valid @RequestBody BookIndexRequest bookIndexRequest) {
		return BaseResponse.<String>builder().data("test").build();
	}
}
