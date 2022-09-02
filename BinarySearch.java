
public class BinarySearch {

	private static int[] list = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void main(String[] args) {
if (binarySearch(list, 7)) {
	System.out.print("Found 7");
}
	}

	private static boolean binarySearch(final int[] array, final int search) {

		int first = 0;

		int last = array.length - 1;

		int middle = (first + last) / 2;

		while (first <= last) {

			if (array[middle] < search) {
				first = middle + 1;
			}

			else if (array[middle] == search) {

				return true;
			}

			else {

				last = middle - 1;
			}

			middle = (first + last) / 2;
		}

		return false;

	}
}
