package me.uc.data.es.client;

import me.uc.data.es.DateEsConstant;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = DateEsConstant.SERVICE_NAME)
public interface DataEsClient {

}
