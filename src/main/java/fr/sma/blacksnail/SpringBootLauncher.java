package fr.sma.blacksnail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableScheduling
@EnableAutoConfiguration
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "fr.sma.blacksnail")
public class SpringBootLauncher {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLauncher.class, args);
	}
}
