package za.co.entelect.tourzimcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TourzimCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourzimCoreApplication.class, args);
	}

}
