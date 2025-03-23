package pkgQuestion16;

import java.util.ArrayList;


public class VolunteerManager {
	public static final int MAX_VOLUNTEERS = 15;
	private ArrayList<String> volunteers;

	public VolunteerManager() {
		this.volunteers = new ArrayList<>();
	}

	public boolean addVolunteer(String name) {
		if (volunteers.size() < MAX_VOLUNTEERS) {
			volunteers.add(name);
			System.out.println(name + " has been added. Total volunteers: " + volunteers.size());
			return true;
		} else {
			System.out.println("No more candidates allowed as volunteers. Thank you.");
			return false;
		}
	}
}
