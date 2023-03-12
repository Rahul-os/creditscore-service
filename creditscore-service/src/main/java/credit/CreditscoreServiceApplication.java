package credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient       // added while using eureka server
public class CreditscoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditscoreServiceApplication.class, args);
	}

}
