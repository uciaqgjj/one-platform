package me.uc.data.es.client;

import me.uc.common.core.api.BaseResponse;
import me.uc.data.es.DateEsConstant;
import me.uc.data.es.dto.BookIndexRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(name = DateEsConstant.SERVICE_NAME)
public interface DataEsClient {

	@PostMapping("/v1/biz/testIndexBook")
	BaseResponse<String> testIndexBook(@Valid @RequestBody BookIndexRequest request);
}
