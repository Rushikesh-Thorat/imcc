package pkgQuestion11;

import java.util.Arrays;
import java.util.Collections;

public class SortArray implements SortingUtility {
	
	private Integer[] arr;
	public SortArray(Integer[] arr) {
		this.arr = arr;
	}
	
	@Override
	public void ascendingSort() {
		Arrays.sort(arr);
		System.out.println("Ascending Sorted Array: " + Arrays.toString(arr));
		}

	@Override
	public void descendingSort() {
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Descending Sorted Array: " + Arrays.toString(arr));
	}

}

