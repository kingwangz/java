package king1;

public class koing1 {
	public static void main(String[] args) {
		int array[] = new int[] { 34, 32, 23, 56, 78, 67 };
		koing1 sorter = new koing1();
		sorter.sort(array);
	}

	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		showArray(array);

	}

	public void showArray(int[] array) {
		for (int i : array) {
			System.out.print(">" + i);
		}
		System.out.println();

	}
}