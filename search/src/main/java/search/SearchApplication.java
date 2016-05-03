package search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import search.service.DocumentService;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SearchApplication {

	@Autowired
	private DocumentService docService;

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}
}
