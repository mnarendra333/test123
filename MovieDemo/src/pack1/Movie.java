package pack1;

public class Movie {

	private String movName;

	private String heroName;
	private int yearRel;

	public Movie(String movName, String heroName, int yearRel) {
		super();
		this.movName = movName;
		this.heroName = heroName;
		this.yearRel = yearRel;
	}

	public String getMovName() {
		return movName;
	}

	public String getHeroName() {
		return heroName;
	}

	public int getYearRel() {
		return yearRel;
	}

	@Override
	public String toString() {
		return "Movie [movName=" + movName + ", heroName=" + heroName + ", yearRel=" + yearRel + "]";
	}
	
	
	

}
