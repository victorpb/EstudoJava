package inheritance;

public class Employee {

	private String name;
	private double salary;

	// functions publics

	public double calculateBonus() {
		return this.salary * 0.1;
	}

	public void printValues() {
		System.out.println("Manager");
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("Bonus: " + this.calculateBonus());
	}

	// GETTERS and SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
