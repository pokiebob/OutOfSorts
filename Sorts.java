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

	public static void main(String[] args) {
	}
}