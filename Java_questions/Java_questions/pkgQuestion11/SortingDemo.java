package pkgQuestion11;

public class SortingDemo {
	public static void main(String[] args) {
		Integer[] numbers = {5, 2, 9, 1, 7};
		String text = "Apple";
		
		SortArray sortArray = new SortArray(numbers);
		System.out.println("Sorting Integer Array:");
		sortArray.ascendingSort();
		sortArray.descendingSort();
		
		SortString sortString = new SortString(text);
		System.out.println("\nSorting String:");
		sortString.ascendingSort();
		sortString.descendingSort();
	}
}
