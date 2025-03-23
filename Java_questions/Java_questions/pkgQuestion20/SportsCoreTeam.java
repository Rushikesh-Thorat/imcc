package pkgQuestion20;
import java.util.Scanner;
public class SportsCoreTeam {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SportsTeamProcessor processor = new SportsTeamProcessor();

        processor.addFootballPlayers(scanner);
        processor.addCricketPlayers(scanner);
        processor.findCoreTeam();
        processor.displayCoreTeam();

        scanner.close();
    }
}
