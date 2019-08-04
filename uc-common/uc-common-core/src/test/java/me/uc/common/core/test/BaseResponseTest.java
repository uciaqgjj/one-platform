package me.uc.common.core.test;

import lombok.extern.slf4j.Slf4j;
import me.uc.common.core.api.BaseResponse;
import me.uc.common.core.api.ResultCode;
import org.junit.Test;

@Slf4j
public class BaseResponseTest {

	@Test
	public void printResponse() {
		BaseResponse resp =
				BaseResponse.builder().code(ResultCode.INTERNAL_SERVER_ERROR).message("test").build();

		log.info(resp.toString());
	}

	@Test
	public void testListResponse() {

	}
}
