

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int leght;
	private float cost;

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLeght() {
		return leght;
	}

	public float getCost() {
		return cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int leght, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.leght = leght;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public boolean equals(DigitalVideoDisc disc) {
		return this.title.equals(disc.title) && this.category.equals(disc.category) ? true : false;
	}

}
