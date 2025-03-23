package pkgOrgStructure;

public class Developer extends Employee{
	String programmingLanguage;

	public Developer(String name, int empId, double salary, String programmingLanguage) {
		super(name, empId, salary);
		this.programmingLanguage = programmingLanguage;
		
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Programming Language: " + programmingLanguage);
	}
}
