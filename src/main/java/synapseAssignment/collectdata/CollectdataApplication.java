package synapseAssignment.collectdata;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class CollectdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectdataApplication.class, args);}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}


}
