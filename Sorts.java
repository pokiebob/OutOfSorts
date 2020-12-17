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

	public static void insertionSort(int[] data) {
		int index, current;
		for (int i = 1; i < data.length; i++) {
			current = data[i];
			index = i - 1;
			while (index >= 0 && data[index] > current) {
				data[index + 1] = data[index];
				index--;
			}
			data[index + 1] = current;
		}
	}

	public static void main(String[] args) {
	}
}