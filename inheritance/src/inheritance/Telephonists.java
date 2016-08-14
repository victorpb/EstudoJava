package inheritance;

public class Telephonists extends Employee {

	private int workstantionCode;

	// OVERRIDE

	@Override
	public void printValues() {

		super.printValues();
		System.out.println("Workstation Code: " + this.workstantionCode);
	}

	// GETTERS and SETTERS

	public final int getWorkstantionCode() {
		return workstantionCode;
	}

	public final void setWorkstantionCode(int workstantionCode) {
		this.workstantionCode = workstantionCode;
	}

}
