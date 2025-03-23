package pkgOrgStructure4;

public class Developer extends Employee {

	    private String nameOfTheTeam, nameOfManager, technologies;

	    public Developer(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd,
	                     String empDept, double empSal, String empContactNbr, int empExp,
	                     String nameOfTheTeam, String nameOfManager, String technologies) {
	        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
	        this.nameOfTheTeam = nameOfTheTeam;
	        this.nameOfManager = nameOfManager;
	        this.technologies = technologies;
	    }

	    // Override details() and use super.details()
	    @Override
	    public void details() {
	        super.details();
	        System.out.println("Team: " + nameOfTheTeam + ", Manager: " + nameOfManager +
	                ", Technologies: " + technologies);
	    }

	    // Override computeSalary()
	    @Override
	    public void computeSalary() {
	        empSal *= 6;
	        System.out.println("Updated Developer Salary: " + empSal);
	    }
	}

