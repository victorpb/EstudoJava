package inheritance;

public class Secretary extends Employee {

	private int extensionLine;

	// OVERRIDE

	@Override
	public void printValues() {
		super.printValues();
		System.out.println("Extension Line: " + this.extensionLine);
	}

	// GETTERS and SETTERS

	public final int getExtensionLine() {
		return extensionLine;
	}

	public final void setExtensionLine(int extensionLine) {
		this.extensionLine = extensionLine;
	}

}
