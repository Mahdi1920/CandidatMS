package tn.esprit.candidat_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CandidatMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatMsApplication.class, args);
	}

}
