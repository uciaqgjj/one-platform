package me.uc.agg.demo.web;

import lombok.AllArgsConstructor;
import me.uc.common.core.api.BaseResponse;
import me.uc.data.es.client.DataEsClient;
import me.uc.data.es.dto.BookIndexRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author uc
 * @description TODO
 * @date 2019/8/5
 */
@AllArgsConstructor
@RestController
@RequestMapping("/v1/bookIndex")
public class BookIndexController {

	private DataEsClient dataEsClient;

	@GetMapping("indexBook")
	public BaseResponse indexBook() {
		BookIndexRequest bookIndexRequest = BookIndexRequest.builder().build();
		BaseResponse<String> response = dataEsClient.testIndexBook(bookIndexRequest);
		return BaseResponse.builder().message(response.toString()).build();
	}
}
