package arrayPrac;

public class LeadersInArray {
	static void findLeaders(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			int j;
			for (j = i + 1; j < size; j++) {
				if (arr[i] <= arr[j]) {
					break; // Found a larger element, not a leader
				}
			}
			// If loop completed without breaking, it's a leader
			if (j == size) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 16, 17, 4, 3, 5, 2 };
		System.out.println("Leaders in the array are: ");
		findLeaders(array, array.length);
	}
}
