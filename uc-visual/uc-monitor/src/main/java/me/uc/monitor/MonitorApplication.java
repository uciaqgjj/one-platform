package me.uc.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author uc
 * @description TODO
 * @date 2019/8/2
 */
@SpringBootApplication
@EnableAdminServer
public class MonitorApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonitorApplication.class);
	}
}
