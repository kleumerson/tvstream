package com.tvstream.stream;

import com.tvstream.model.DataSerie;
import com.tvstream.service.ConsumeApi;
import com.tvstream.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StreamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumeApi = new ConsumeApi();
		var json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConvertData convertData = new ConvertData();
		DataSerie data = convertData.getData(json, DataSerie.class);
		System.out.println(data);
	}
}
