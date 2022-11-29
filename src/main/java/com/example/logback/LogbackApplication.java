package com.example.logback;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackApplication {

	private static final Logger log = (Logger) LoggerFactory.getLogger(LogbackApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(LogbackApplication.class, args);
		log.trace("스프링 어플리케이션 시작");
		log.debug("스프링 어플리케이션 시작");
		log.info("스프링 어플리케이션 시작");
		log.warn("스프링 어플리케이션 시작");
		log.error("스프링 어플리케이션 시작");
	}

}
