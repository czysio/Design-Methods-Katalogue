package pl.krzysiek.olejnik.dmkatalogue;

import javax.validation.Validator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import pl.krzysiek.olejnik.dmkatalogue.utility.StorageProperties;
import pl.krzysiek.olejnik.dmkatalogue.utility.StorageService;

@ComponentScan("pl.krzysiek.olejnik")
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class DMKatalogue {

	public static void main(String[] args) {
		SpringApplication.run(DMKatalogue.class, args);
	}
	
	@Bean
	public Validator validator() {
	    return new LocalValidatorFactoryBean();
	}
	
	@Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.init();
        };
    }
}
