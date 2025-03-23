package pkgQuestion14;
import java.util.Scanner;
public class TabletChecker {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter the weight of the tablet (mg): ");
	            double weight = scanner.nextDouble();
	            TabletManufacturing.checkTabletWeight(weight);
	        } catch (TabletWeightExceededException e) {
	            System.out.println("Exception: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please enter a valid number.");
	        } finally {
	            scanner.close();
	            System.out.println("Tablet weight check completed.");
	        }
	    }
}
