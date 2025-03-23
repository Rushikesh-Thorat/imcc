package pkgQuestion22;
import java.util.ArrayList;
public class BattingLineup {
	private ArrayList<String> lineup;

    // Constructor to initialize lineup
    public BattingLineup(ArrayList<String> players) {
        this.lineup = new ArrayList<>(players);
    }

    // Method to update a player in the lineup
    public void updatePlayer(int index, String newPlayer) {
        if (index >= 0 && index < lineup.size()) {
            lineup.set(index, newPlayer);
        } else {
            System.out.println("Invalid index! No changes made.");
        }
    }

    // Method to display the lineup
    public void displayLineup(String teamName) {
        System.out.println(teamName + " Batting Lineup:");
        for (int i = 0; i < lineup.size(); i++) {
            System.out.println((i + 1) + ". " + lineup.get(i));
        }
        System.out.println();
    }
}
