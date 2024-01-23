package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Item> items = new ArrayList<>();

	public void addItem(Item item) {

		items.add(item);
	}

	public boolean removeItem(Item item) {
		return items.remove(item);

	}

	public boolean removeItem(int id) {
		for (Item i : this.items) {
			if (id == i.getId())
				return this.items.remove(i);
		}
		return false;
	}

	public void checkOut(Item item) {
		item.setAvailable(false);
	}

	public void checkIn(Item item) {
		item.setAvailable(true);
	}

	private ArrayList<Customer> customers = new ArrayList<>();

	public void regCust(Customer customer) {

		customers.add(customer);
	}

	public boolean deregCust(Customer customer) {
		customers.remove(customer);
		return true;

	}

	public boolean deregCust(int id) {
		for (Customer c : this.customers) {
			if (id == c.getId()) {
				return this.customers.remove(c);
			}
		}
		return false;
	}

//	public boolean updateCust(int id, String newName) {
//
//		for (Customer c : customers) {
//			if (id == c.getId()) {
//
//			}
//		}
//	}

	@Override
	public String toString() {
		return "Library " + "[" + "\n" + "items=" + items + "\n" + " customers=" + customers + "]";
	}

}
