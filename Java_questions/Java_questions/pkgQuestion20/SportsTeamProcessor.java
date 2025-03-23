package pkgQuestion20;
import java.util.ArrayList;
import java.util.Scanner;
public class SportsTeamProcessor {
	private ArrayList<String> footballPlayers;
    private ArrayList<String> cricketPlayers;
    private ArrayList<String> coreTeam;

    public SportsTeamProcessor() {
        footballPlayers = new ArrayList<>();
        cricketPlayers = new ArrayList<>();
        coreTeam = new ArrayList<>();
    }

    public void addFootballPlayers(Scanner scanner) {
        System.out.print("Enter the number of students in Football team: ");
        int footballCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the names of Football players:");
        for (int i = 0; i < footballCount; i++) {
            footballPlayers.add(scanner.nextLine());
        }
    }

    public void addCricketPlayers(Scanner scanner) {
        System.out.print("Enter the number of students in Cricket team: ");
        int cricketCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the names of Cricket players:");
        for (int i = 0; i < cricketCount; i++) {
            cricketPlayers.add(scanner.nextLine());
        }
    }

    public void findCoreTeam() {
        for (String player : footballPlayers) {
            if (cricketPlayers.contains(player)) {
                coreTeam.add(player);
            }
        }
    }

    public void displayCoreTeam() {
        System.out.println("\nStudents selected for the Sports Core Team:");
        if (coreTeam.isEmpty()) {
            System.out.println("No common players found.");
        } else {
            for (String player : coreTeam) {
                System.out.println(player);
            }
        }
    }
}
