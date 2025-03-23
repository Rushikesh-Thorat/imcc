package pkgQuestion21;
import java.util.*;

class TopScorers {
	   // Method to find top three scores
	   public static List<Integer> getTopThree(List<Integer> scores) {
	       List<Integer> topScores = new ArrayList<>();
	        
	       for (int i = 0; i < 3; i++) {
	           if (scores.isEmpty()) break; // Handle case where there are less than 3 scores
	            
	           int maxScore = Collections.max(scores); // Find the max score
	           topScores.add(maxScore);
	           scores.remove(Integer.valueOf(maxScore)); // Remove the first occurrence of the max score
	       }
	        
	       return topScores;
	   }
}
