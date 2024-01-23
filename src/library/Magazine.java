package library;

public class Magazine extends Item {

	private boolean pictures;

	public Magazine(String name, int length, int year, boolean available, boolean pictures) {
		super(name, length, year, available);
		this.pictures = pictures;
	}

	public Magazine() {
		super();
	}

	public boolean isPictures() {
		return pictures;
	}

	public void setPictures(boolean pictures) {
		this.pictures = pictures;
	}

	@Override
	public String printRentLength() {
		return "14 days";
	}

	@Override
	public String toString() {
		return "Magazine [pictures=" + pictures + ", name=" + getName() + ", length=" + getLength() + ", year="
				+ getYear() + ", id=" + getId() + ", available=" + isAvailable() + "]";
	}

}
