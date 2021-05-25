package ua.lviv.iot.fruitsshop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.fruitsshop.controllers", "ua.lviv.iot.fruitsshop.service" })
public class fruitsshopApp {

	public static void main(String[] args) {
		SpringApplication.run(fruitsshopApp.class, args);
	}

}