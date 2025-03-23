package pkgQuestion16;
import java.util.Scanner;


public class CulturalCommitteeApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolunteerManager manager = new VolunteerManager();

        System.out.println("Enter the names of volunteers (maximum " + VolunteerManager.MAX_VOLUNTEERS + " members):");
        
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (!manager.addVolunteer(name)) {
                break;
            }
        }
        
        scanner.close();
    }
}
