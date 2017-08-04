package king1;

import java.util.Arrays;

public class koing1 {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		Arrays.fill(a, 1, 3, 8);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}