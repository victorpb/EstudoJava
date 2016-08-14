package inheritance;

public class Manager extends Employee {

	private String username;
	private String password;

	// OVERRIDE

	@Override
	public double calculateBonus() {
		return this.getSalary() * 0.6 + 100;
	}

	@Override
	public void printValues() {

		super.printValues();
		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
	}

	// GETTERS and SETTERS

	public String getusername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
