package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {

		Manager manager = new Manager();
		manager.setName("Manager");
		manager.setSalary(100.99);
		manager.setUsername("manager.user");
		manager.setPassword("password");

		Secretary secretary = new Secretary();
		secretary.setName("Secretary");
		secretary.setSalary(200);
		secretary.setExtensionLine(001);

		Telephonists telephonists = new Telephonists();
		telephonists.setName("Telephonists");
		telephonists.setSalary(300);
		telephonists.setWorkstantionCode(10);

		// prints

		manager.printValues();

		System.out.println("-------------------------------------------------");

		secretary.printValues();

		System.out.println("-------------------------------------------------");

		telephonists.printValues();

	}

}
