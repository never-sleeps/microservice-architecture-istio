package ru.otus.microservicearchitecture.homework04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.util.Properties;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception{
		SpringApplication application = new SpringApplication(Application.class);

		Properties properties = new Properties();
		properties.load(new FileInputStream("./config/application.properties"));
		application.setDefaultProperties(properties);

		System.out.println("Properties loaded: " + properties);

		application.run(args);
	}
}
