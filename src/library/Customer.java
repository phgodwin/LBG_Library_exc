package library;

public class Customer {

	private String fname;

	private String lname;

	private static int count;

	private final int id;

	public Customer(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.id = ++count;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Customer [first name=" + fname + ", last name=" + lname + ", id=" + id + "]";
	}

}
