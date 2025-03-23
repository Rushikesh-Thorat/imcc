package pkgQuestion21;
import java.util.*;
public class CodingClubDemo {
	public static void main(String[] args) {
        // Example scores
        List<Integer> scores = new ArrayList<>(Arrays.asList(85, 92, 78, 90, 88, 95, 100, 97, 94));
        
        // Get the top three scores
        List<Integer> topThree = TopScorers.getTopThree(scores);
        
        // Display the top three scorers
        System.out.println("Top three scores are: " + topThree);
    }
}
