package king1;

import javax.print.DocFlavor.INPUT_STREAM;

public class koing1 {
	public static int add(int i) {
		return i;
	}

	public static int add(int i, int q) {
		return i + q;
	}

	public static double add(double i, int q) {
		return i + q;
	}

	public static double add(double i, double q) {
		return i + q;
	}

	public static int[] add(int... a) {
		int s[] = new int[] { 'a' };
		return s;
	}

	public static void main(String[] args) {
		System.out.println(add(2));
		System.out.println(add(2.7, 2.3));
		System.out.println(add(2, 3));
		System.out.println(add(2.3, 2));
		System.out.println(add(2));
		System.out.println(add(1, 2, 34, 5));
	}
}