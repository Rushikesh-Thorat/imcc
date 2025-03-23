package pkgOrgStructure2;

public class Developer extends Employee {
    // Additional attributes
    private String nameOfTheTeam;
    private String nameOfManager;
    private String technologies;

    // Constructor
    public Developer(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept, double empSal, String empContactNbr, int empExp, String nameOfTheTeam, String nameOfManager, String technologies) {
        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
        setNameOfTheTeam(nameOfTheTeam);
        setNameOfManager(nameOfManager);
        setTechnologies(technologies);
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

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    // Override displayDetails to include developer-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Name of the Team: " + nameOfTheTeam);
        System.out.println("Name of the Manager: " + nameOfManager);
        System.out.println("Technologies: " + technologies);
    }
}