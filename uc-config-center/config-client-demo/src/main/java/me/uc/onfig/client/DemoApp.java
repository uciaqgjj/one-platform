package me.uc.onfig.client;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class DemoApp {
	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class);
	}
}
