package pkgQuestion17;
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
        
        System.out.println("Now, each volunteer must pick a historical character as their badge icon.");
        for (String volunteer : manager.volunteers) {
            while (true) {
                System.out.print(volunteer + ", choose your historical character: ");
                String character = scanner.nextLine();
                if (manager.assignCharacter(volunteer, character)) {
                    break;
                }
            }
        }
        
        scanner.close();
    }
}
