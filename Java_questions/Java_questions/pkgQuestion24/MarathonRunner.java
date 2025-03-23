package pkgQuestion24;
import java.util.Comparator;

public class MarathonRunner {
	private String name;
    private int badgeNbr;
    private String startTime;
    private String endTime;

    public MarathonRunner(String name, int badgeNbr, String startTime, String endTime) {
        this.name = name;
        this.badgeNbr = badgeNbr;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public int getBadgeNbr() {
        return badgeNbr;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Runner: " + name + " | Badge No: " + badgeNbr + 
               " | Start Time: " + startTime + " | End Time: " + endTime;
    }

    // Comparator for sorting by end time
    public static Comparator<MarathonRunner> endTimeComparator = new Comparator<MarathonRunner>() {
        public int compare(MarathonRunner r1, MarathonRunner r2) {
            return r1.getEndTime().compareTo(r2.getEndTime());
        }
    };
}
