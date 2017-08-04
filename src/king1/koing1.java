package king1;

import java.util.Arrays;

public class koing1 {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 6, 8, 4, 5 };
		Arrays.sort(a);
		int b = Arrays.binarySearch(a, 5);
		System.out.println(b);
	}
}