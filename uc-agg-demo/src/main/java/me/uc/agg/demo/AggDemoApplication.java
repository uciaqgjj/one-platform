package me.uc.agg.demo;

import me.uc.data.es.client.DataEsClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author uc
 * @description TODO
 * @date 2019/8/5
 */
@SpringBootApplication
@EnableFeignClients(clients = {DataEsClient.class})
public class AggDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AggDemoApplication.class);
	}


}
