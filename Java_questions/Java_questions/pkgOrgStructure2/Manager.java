package pkgOrgStructure2;

public class Manager extends Employee {
    // Additional attributes
    private int noOfTeams;
    private int noOfReportees;

    // Constructor
    public Manager(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept, double empSal, String empContactNbr, int empExp, int noOfTeams, int noOfReportees) {
        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
        setNoOfTeams(noOfTeams);
        setNoOfReportees(noOfReportees);
    }

    // Getters and Setters
    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    public int getNoOfReportees() {
        return noOfReportees;
    }

    public void setNoOfReportees(int noOfReportees) {
        this.noOfReportees = noOfReportees;
    }

    // Override displayDetails to include manager-specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Teams: " + noOfTeams);
        System.out.println("Number of Reportees: " + noOfReportees);
    }
}