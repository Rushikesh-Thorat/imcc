package pkgQuestion17;

import java.util.ArrayList;

public class VolunteerManager {
	static final int MAX_VOLUNTEERS = 15;
	ArrayList<String> volunteers;
	private ArrayList<String> historicalCharacters;

	public VolunteerManager() {
		this.volunteers = new ArrayList<>();
		this.historicalCharacters = new ArrayList<>();
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

	public boolean assignCharacter(String name, String character) {
		if (historicalCharacters.contains(character)) {
			System.out.println("Character already taken! Please choose another.");
			return false;
		} else {
			historicalCharacters.add(character);
			System.out.println(name + " has chosen " + character + " as their badge icon.");
			return true;
		}
	}
}
