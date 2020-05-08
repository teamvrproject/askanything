package com.vr.askanything;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Log4j
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		//log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
	}
}
