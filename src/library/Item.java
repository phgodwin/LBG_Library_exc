package library;

public abstract class Item implements Comparable<Item> {

	private static int count;

	private final int id;

	private String name;

	private int length;

	private int year;

	private boolean available;

	public Item(String name, int length, int year, boolean available) {
		super();
		this.id = ++count;
		this.name = name;
		this.length = length;
		this.year = year;
		this.available = available;
	}

	public Item() {
		super();
		this.id = ++count;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;

	}

	public abstract String printRentLength();

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", length=" + length + ", year=" + year + ", available="
				+ available + "]";
	}

	@Override
	public int compareTo(Item o) {
		return 0;
	}

}
