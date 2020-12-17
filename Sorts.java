public class Sorts{
	/**Bubble sort of an int array. 
	*Upon completion, the elements of the array will be in increasing order.
	*@param data  the elements to be sorted.
	*/
	public static void bubbleSort(int[] data) {
		boolean cont = true;
		int prev;
		while (cont) {
			cont = false;
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i] > data[i+1]) {
					prev = data[i];
					data[i] = data[i+1];
					data[i+1] = prev;
					cont = true;
				}
			}
		}
	}

	public static void selectionSort(int[] data) {
		int currentMinimum, prev;
		for (int i = 0; i < data.length; i++) {
			currentMinimum = i;
			for (int j = i; j < data.length; j++) {
				if (data[j] < data[currentMinimum]) {
					currentMinimum = j;
				}
			}
			if (currentMinimum != i) {
				prev = data[i];
				data[i] = data[currentMinimum];
				data[currentMinimum] = prev;
			}
		}
	}


	public static void main(String[] args) {
		int[] data = { 234, -352, 0, 4, -3, 2, 34, -32, -31, 0, 78};
		
		int[] bubbleSorted = data;
		bubbleSort(bubbleSorted);
		System.out.println("bubbleSort: ");
		for (int i : bubbleSorted) {
			System.out.println(i);
		}

		int[] selectionSorted = data;
		selectionSort(selectionSorted);
		System.out.println("selectionSort: ");
		for (int i : selectionSorted) {
			System.out.println(i);
		}
	}
}