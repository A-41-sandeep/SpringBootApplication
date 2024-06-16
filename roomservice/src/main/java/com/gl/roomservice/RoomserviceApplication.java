package com.gl.roomservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RoomserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomserviceApplication.class, args);
	}

}
