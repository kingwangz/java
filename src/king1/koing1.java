package king1;

import java.util.Arrays;

public class koing1 {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 6, 8, 4, 5 };
		int n[] = Arrays.copyOfRange(a, 1, 3);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}