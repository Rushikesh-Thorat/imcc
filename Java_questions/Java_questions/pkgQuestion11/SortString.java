package pkgQuestion11;

import java.util.Arrays;
import java.util.Collections;

public class SortString implements SortingUtility {
	
	private String str;
	
	public SortString(String str) {
		this.str = str;
	}
	@Override
	public void ascendingSort() {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println("Ascending Sorted String: " + new String(charArray));
	}

	@Override
	public void descendingSort() {
		Character[] charArray = new Character[str.length()];
		for(int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		Arrays.sort(charArray, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder(charArray.length);
		for(Character ch : charArray) {
			sb.append(ch);
		}
		System.out.println("Descending Sorted String: " + sb.toString());
	}

}
