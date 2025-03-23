package pkgOrgStructure2;

public class Tester extends Employee {
    // Additional attributes
    private String nameOfTheTeam;
    private String nameOfManager;
    private String testingType;

    // Constructor
    public Tester(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept, double empSal, String empContactNbr, int empExp, String nameOfTheTeam, String nameOfManager, String testingType) {
        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
        setNameOfTheTeam(nameOfTheTeam);
        setNameOfManager(nameOfManager);
        setTestingType(testingType);
    }

    // Getters and Setters
    public String getNameOfTheTeam() {
        return nameOfTheTeam;
    }

    public void setNameOfTheTeam(String nameOfTheTeam) {
        this.nameOfTheTeam = nameOfTheTeam;
    }

    public String getNameOfManager() {
        return nameOfManager;
    }

    public void setNameOfManager(String nameOfManager) {
        this.nameOfManager = nameOfManager;
    }

    public String getTestingType() {
        return testingType;
    }

    public void setTestingType(String testingType) {
        this.testingType = testingType;
    }

    // Override displayDetails to include tester-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Name of the Team: " + nameOfTheTeam);
        System.out.println("Name of the Manager: " + nameOfManager);
        System.out.println("Testing Type: " + testingType);
    }
}