/**
 * @author Ashwini
 */
package com.org.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Spring Boot started: Car API Server");
    }
}
