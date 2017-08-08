package king1;

public class koing1 {
	public static int k(double num1, double num2) {
		int s = (int) num1 + (int) (Math.random() * (num2 - num1));
		return s;
	}

	public static char n(char n1, char n2) {
		char n = (char) (n1 + Math.random() * (n2 - n1));
		return n;
	}

	public static void main(String[] args) {
		System.out.println(k(2, 10));
		System.out.println(n('a', 'z'));
		System.out.println(n('0', '9'));
	}
}