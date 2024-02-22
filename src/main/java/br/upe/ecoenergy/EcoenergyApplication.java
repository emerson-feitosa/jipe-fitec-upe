package br.upe.ecoenergy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.upe.ecoenergy.domain")
public class EcoenergyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcoenergyApplication.class, args);
    }

}
