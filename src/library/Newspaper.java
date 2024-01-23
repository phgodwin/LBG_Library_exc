package library;

public class Newspaper extends Item {

	private int cost;

	public Newspaper(String name, int length, int year, boolean available, int cost) {
		super(name, length, year, available);
		this.cost = cost;
	}

	public Newspaper() {
		super();
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String printRentLength() {
		return "10 days";
	}

	@Override
	public String toString() {
		return "Newspaper [cost=" + cost + ", name=" + getName() + ", length=" + getLength() + ", year=" + getYear()
				+ ", id=" + getId() + ", available=" + isAvailable() + "]";
	}

}
