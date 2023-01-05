package com.example.block16ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Block16TicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(Block16TicketApplication.class, args);
	}

}
