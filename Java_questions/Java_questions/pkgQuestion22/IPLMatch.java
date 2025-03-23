package pkgQuestion22;
import java.util.ArrayList;
public class IPLMatch {
	public static void main(String[] args) {
        // Initial batting lineups
        ArrayList<String> kkrPlayers = new ArrayList<>();
        kkrPlayers.add("VenkateshIyer");
        kkrPlayers.add("NitishRana");
        kkrPlayers.add("QuintonDeKock");
        kkrPlayers.add("ShreyasIyer");
        kkrPlayers.add("AndreRussell");

        ArrayList<String> miPlayers = new ArrayList<>();
        miPlayers.add("RohitSharma");
        miPlayers.add("IshanKishan");
        miPlayers.add("SuryakumarYadav");
        miPlayers.add("TilakVarma");
        miPlayers.add("HardikPandya");

        // Creating objects for each team's lineup
        BattingLineup kkr = new BattingLineup(kkrPlayers);
        BattingLineup mi = new BattingLineup(miPlayers);

        // Display original lineups
        kkr.displayLineup("KKR");
        mi.displayLineup("Mumbai Indians");

        // Update KKR lineup: Replacing QuintonDeKock with AnukulRoy at position 2 (index 2)
        kkr.updatePlayer(2, "AnukulRoy");

        // Display updated KKR lineup
        System.out.println("After last-minute change in KKR's batting order:\n");
        kkr.displayLineup("KKR");
    }
}
