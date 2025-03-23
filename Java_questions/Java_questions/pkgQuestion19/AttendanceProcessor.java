package pkgQuestion19;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceProcessor {
	public ArrayList<String> getAttendanceList(Scanner scanner, String divisionName) {
        ArrayList<String> divisionList = new ArrayList<>();
        System.out.println("Enter the number of students present in " + divisionName + ":");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the names of students present in " + divisionName + ":");
        for (int i = 0; i < numStudents; i++) {
            divisionList.add(scanner.nextLine());
        }
        return divisionList;
    }

    public ArrayList<String> consolidateAttendance(ArrayList<String> divisionA, ArrayList<String> divisionB) {
        ArrayList<String> consolidatedList = new ArrayList<>(divisionA);
        for (String student : divisionB) {
            if (!consolidatedList.contains(student)) { // Avoid duplicate names
                consolidatedList.add(student);
            }
        }
        return consolidatedList;
    }
}
