package pkgQuestion24;
import java.util.*;

public class MarathonApp {
	public static void main(String[] args) {
        List<MarathonRunner> finishers = new ArrayList<>();

        // Adding some marathon runners (Badge Number, Start Time, End Time)
        finishers.add(new MarathonRunner("Vedant Girjapure", 101, "06:00:00", "08:30:00"));
        finishers.add(new MarathonRunner("Atharv Kankatre", 102, "06:00:00", "08:15:00")); // First finisher
        finishers.add(new MarathonRunner("Akash Dhadage", 103, "06:00:00", "09:00:00"));  // Last finisher

        // Sorting runners based on their end time
        finishers.sort(MarathonRunner.endTimeComparator);

        // Displaying the first and last finisher
        if (!finishers.isEmpty()) {
            System.out.println("First Finisher:\n" + finishers.get(0));
            System.out.println("\nLast Finisher:\n" + finishers.get(finishers.size() - 1));
        } else {
            System.out.println("No runners finished the marathon.");
        }
    }
}
