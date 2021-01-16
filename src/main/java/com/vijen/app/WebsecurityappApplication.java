package com.vijen.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
/*
 * @EnableTransactionManagement
 * 
 * @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
 */
public class WebsecurityappApplication extends SpringBootServletInitializer {
	/*
	 * @Bean public DataSource dataSource() { CustomRoutingDataSource
	 * customDataSource = new CustomRoutingDataSource();
	 * customDataSource.setTargetDataSources(DataSourceMap.getDataSourceHashMap());
	 * return customDataSource; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(WebsecurityappApplication.class, args);

//		MovieService movieService = (MovieService) ctx.getBean("movieService");
//
//		// delete all
//		movieService.deleteAll();
//
//		Movie spiderMan = new Movie(1, "Spider Man", 2002, "Sam Raimi");
//		Movie casinoRoyale = new Movie(2, "Casino Royale", 2006, "Martin Campbell");
//		Movie avengersEndgame = new Movie(3, "Avengers: Endgame", 2019, "Anthony Russo");
//
//		Movie captainMarvel = new Movie(4, "Captain Marvel", 2019, "Anna Boden");
//
//		// added
//		movieService.addMovie(spiderMan);
//		movieService.addMovie(casinoRoyale);
//		movieService.addMovie(avengersEndgame);
//		movieService.addMovie(captainMarvel);
//
//		List<Movie> movies = movieService.findAll();
//		System.out.println(movies);
//		System.out.println("-----------------------------------------");
//		// delete
//		movieService.deleteMovie(1);
//		movies = movieService.findAll();
//		System.out.println(movies);
//		System.out.println("-----------------------------------------");
//
//		// update
//		movieService.editMovie(new Movie(2, "Casino Royale [Updated]", 2006, "Martin Campbell [Updated]"), 2);
//		movies = movieService.findAll();
//		System.out.println(movies);
//		System.out.println("-----------------------------------------");
//
//		Movie movie = movieService.find(4);
//		System.out.println(movie);
//		System.out.println("-----------------------------------------");

	}
}