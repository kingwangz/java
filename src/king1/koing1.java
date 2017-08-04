package king1;

import java.util.Arrays;

public class koing1 {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 6, 8, 4, 5 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int b = Arrays.binarySearch(a, 0, 4, 4);
		System.out.println(b);
	}
}