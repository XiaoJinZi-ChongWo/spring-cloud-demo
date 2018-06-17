package com.xiaojinzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MiscoCityDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscoCityDataApplication.class, args);
	}
}
