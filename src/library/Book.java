package library;

public class Book extends Item {

	private String genre;

	public Book(String name, int length, int year, boolean available, String genre) {
		super(name, length, year, available);
		this.genre = genre;
	}

	public Book() {
		super();
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String printRentLength() {
		return "7 days";

	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", name=" + getName() + ", length=" + getLength() + ", year=" + getYear()
				+ ", id=" + getId() + ", available=" + isAvailable() + "]";
	}

}
