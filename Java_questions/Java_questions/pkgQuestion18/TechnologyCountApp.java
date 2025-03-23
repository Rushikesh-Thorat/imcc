package pkgQuestion18;
import java.util.*;
public class TechnologyCountApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TechnologyCounter counter = new TechnologyCounter();
        
        // Taking input from 15 students
        System.out.println("Enter the technology name for 15 students:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            counter.addTechnology(scanner.nextLine());
        }
        
        // Getting and displaying the count of each technology
        System.out.println("\nTechnology Count:");
        for (Map.Entry<String, Integer> entry : counter.getTechnologyCount().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
