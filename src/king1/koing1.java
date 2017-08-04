package king1;

public class koing1 {
	public static void main(String[] args) {
		int array[] = new int[] { 34, 32, 23, 56, 78, 67 };
		koing1 sorter = new koing1();
		sorter.sort(array);
	}

	public void sort(int[] array) {
		int k;
		for (int i = 1; i < array.length; i++) {
			k = 0;
			for (int j = 1; j < array.length - i; j++) {
				if (array[j] > array[k]) {
					k = j;
				}
			}
			int temp = array[array.length - i];
			array[array.length - i] = array[k];
			array[k] = temp;
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