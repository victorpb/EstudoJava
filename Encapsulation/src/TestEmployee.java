
public class TestEmployee {

	public static void main(String[] args) {
		Employee Employee1 = new Employee();
		Employee Employee2 = new Employee();

		Employee1.setSalary(100);
		Employee1.setName("Jhonny Due");

		Employee2.setSalary(500);
		Employee2.setName("Kal Marx");

		System.out.println("Name Emplyoee1: " + Employee1.getName());
		System.out.println("Salary Emplyoee1: " + Employee1.getSalary());

		System.out.println("------------------------------------------------------");

		System.out.println("Name Emplyoee2: " + Employee2.getName());
		System.out.println("Salary Emplyoee2: " + Employee2.getSalary());
	}

}
