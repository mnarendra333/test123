package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			BufferedReader br = new BufferedReader(new FileReader("movDataa.txt"));
			String line = null;
			List<Movie> list = new ArrayList<Movie>();
			while ((line = br.readLine()) != null) {

				String[] split = line.split("-");
				String movieName = split[1].trim();
				String heroName = split[0].trim();
				int year = Integer.parseInt(split[2].trim());
				Movie movie = new Movie(movieName, heroName, year);
				list.add(movie);
			}
			System.out.println(list);

			Map<String, List<Movie>> movList = 
					getListOfMoviesActedByHero(list);
			System.out.println("Enter HeroName to get the list of movies!!!");
			Scanner sc = new Scanner(System.in);
			String heroName = sc.next();
			List<Movie> outputList = movList.get(heroName);
			System.out.println(outputList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static Map<String, List<Movie>> getListOfMoviesActedByHero(List<Movie> list) {
		// TODO 
		Map<String, List<Movie>> finalMap = 
				new HashMap<String, List<Movie>>();

		for (Movie movie : list) {
//TODO 
			if (!finalMap.containsKey(movie.getHeroName())) {

				List<Movie> listMov = new ArrayList<Movie>();
				listMov.add(movie);
				finalMap.put(movie.getHeroName(), listMov);

			} else {
				List<Movie> exsMov = finalMap.get(movie.getHeroName());
				exsMov.add(movie);
				finalMap.put(movie.getHeroName(), exsMov);
			}
		}

		return finalMap;
	}

}
