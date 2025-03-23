package pkgOrgStructure;

public class Tester extends Employee {
	String testingTool;
	
	public Tester(String name, int empId, double salary, String testingTool) {
		super(name, empId, salary);
		this.testingTool = testingTool;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Testing Tool: " + testingTool);
	}
}
