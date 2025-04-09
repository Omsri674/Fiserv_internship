package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Impl {
	public static void main(String[] args) {
	
	List<Movie> ListMovie = Arrays.asList(
			new Movie(101, "Ironman", "Russo Brothers"),
			new Movie(102, "Thor", "Russo Brothers"),
			new Movie(103, "Spiderman", "Stan Lee"),
			new Movie(104, "Captain America", "Stan Lee")
			);
	List<String> StanLeeMovies = ListMovie.stream().filter(m -> m.movie_director().equals("Stan Lee")).map(m -> m.movie_name().toUpperCase()).collect(Collectors.toList());
	
	System.out.println("Movies directed by Stan Lee: ");
	System.out.println(StanLeeMovies);
	
	System.out.println("Movies of even id :");
	List<String> EvenMovieDirector =  ListMovie.stream().filter(m -> m.movie_id()%2 == 0).map(m -> m.movie_director().toLowerCase()).collect(Collectors.toList());
	
	System.out.println(EvenMovieDirector);
}

}