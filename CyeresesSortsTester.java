import java.util.Random;

public class CyeresesSortsTester {

	public static boolean isSorted(int[] data) {
		for (int i = 1; i < data.length; i++) {
			if (data[i-1] > data[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] generateRandomArray() {
		Random rand = new Random();

		int[] data = new int[100];
		for (int i = 0; i < 100; i++) {
			data[i] = rand.nextInt(2000) - 1000;
		}
		return data;

	}

	public static int[][] generateTestCases() {
		int[][] testCases = new int[100][100];
		for (int i = 0; i < 100; i++) {
			testCases[i] = generateRandomArray();
		}
		return testCases;
	}

	public static boolean bubbleSortTester(int[][] testCases) {
		int[][] data = testCases;
		boolean success = true;
		System.out.println("boolean bubbleSortIsGud;\n...\n...\n");
		for (int i = 0; i < data.length; i++) {
			Sorts.bubbleSort(data[i]);
			if (! isSorted(data[i])) {
				success = false;
				System.out.println("Test Case " + i + " Unsuccessful:");
				for (int j : data[i]) {
					System.out.println(j);
				}
				System.out.println("\n");
			}
		}
		if (success) {
			System.out.println("bubbleSortIsGud = true;\n\n");
		} else {
			System.out.println("bubbleSortIsGud = false;\n\n");
		}
		return success;
	}

	public static boolean daUltimateTester() {
		int[][] testCases = generateTestCases();
		if (! bubbleSortTester(testCases)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		if (daUltimateTester()) {
			System.out.println("boolean areYouEpicSorterBoi = true;");
		} else {
			System.out.println("boolean areYouEpicSorterBoi = false;");
		}
		
	}
}