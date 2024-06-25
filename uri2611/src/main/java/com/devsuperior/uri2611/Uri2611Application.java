package com.devsuperior.uri2611;

import com.devsuperior.uri2611.dto.MovieMinDto;
import com.devsuperior.uri2611.projections.MovieMinProjection;
import com.devsuperior.uri2611.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2611Application  implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args)  {
		SpringApplication.run(Uri2611Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<MovieMinProjection> list = movieRepository.search("Action");
		List<MovieMinDto> result = list.stream().map(x -> new MovieMinDto(x)).collect(Collectors.toList());

		System.out.println("\n*** RESULTADO SQL RAIZ: ");
		for (MovieMinDto obj : result) {
			System.out.println(obj);
		}
		System.out.println("\n\n");
	}
}
