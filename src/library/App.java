package library;

public class App {

	public static void main(String[] args) {

		Library myLibrary = new Library();

		Book sherlock = new Book("Sherlock", 350, 1970, true, "Detective");
		Book alice = new Book("Alice in Wonderland", 220, 1980, true, "Fantasy");
		Book harry = new Book("Harry Potter", 1997, 300, true, "Fantasy");

		Newspaper sun = new Newspaper("The Sun", 30, 1994, true, 75);
		Newspaper daily = new Newspaper("The Daily Mail", 25, 2005, true, 60);
		Newspaper mirror = new Newspaper("The Daily Mirror", 40, 2001, true, 65);

		Magazine vogue = new Magazine("Vogue", 52, 2000, true, true);
		Magazine take = new Magazine("Take a Break", 35, 2007, true, true);
		Magazine tv = new Magazine("Whats on TV", 40, 2010, true, false);

		myLibrary.addItem(alice);
		myLibrary.addItem(sun);
		myLibrary.addItem(tv);
		myLibrary.addItem(harry);
		myLibrary.addItem(take);
		myLibrary.addItem(daily);
		myLibrary.addItem(vogue);
		myLibrary.addItem(sherlock);
		myLibrary.addItem(mirror);

		Customer craig = new Customer("Craig", "Morris");
		Customer andrew = new Customer("Andrew", "Clark");
		Customer michaela = new Customer("Zoi-Michaela", "Kornianou");
		Customer lucy = new Customer("Lucy", "Ubsdell-Yates");

		myLibrary.regCust(michaela);
		myLibrary.regCust(lucy);
		myLibrary.regCust(craig);
		myLibrary.regCust(andrew);

		System.out.println(myLibrary);

		System.out.println(sun.printRentLength());
		System.out.println(harry.printRentLength());
		System.out.println(daily.printRentLength());

		myLibrary.removeItem(take);
		myLibrary.removeItem(mirror);
		myLibrary.removeItem(sun);
		myLibrary.removeItem(alice);
		myLibrary.removeItem(harry);

		System.out.println("test");

		myLibrary.removeItem(9);

		System.out.println(myLibrary);

	}

}
