package king1;

public class koing1 {
	public static void main(String[] args) {
		int array[] = new int[] { 34, 32, 23, 56, 78, 67 };
		koing1 sorter = new koing1();
		sorter.sort(array);
	}

	public void sort(int[] array) {
		System.out.println("y");
		showArray(array);
		int temp;
		int len = array.length;
		for (int i = 1; i < len / 2; i++) {

			temp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = temp;
		}
		System.out.println("x");
		showArray(array);

	}

	public void showArray(int[] array) {
		for (int i : array) {
			System.out.print("\t" + i);
		}
		System.out.println();

	}
}