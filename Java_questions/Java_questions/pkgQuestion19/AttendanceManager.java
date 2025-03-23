package pkgQuestion19;
import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceManager {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AttendanceProcessor processor = new AttendanceProcessor();

        // Get attendance lists for both divisions
        ArrayList<String> divisionA = processor.getAttendanceList(scanner, "Division A");
        ArrayList<String> divisionB = processor.getAttendanceList(scanner, "Division B");

        // Get consolidated list
        ArrayList<String> consolidatedList = processor.consolidateAttendance(divisionA, divisionB);

        // Display the consolidated list
        System.out.println("\nConsolidated Attendance List:");
        for (String student : consolidatedList) {
            System.out.println(student);
        }

        scanner.close();
    }
}
