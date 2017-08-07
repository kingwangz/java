package king1;

public class koing1 {
	public static void main(String[] args) {
		String c1 = new String();
		String c2 = new String();
		String c3 = c1;
		System.out.println(c2 == c3);
		System.out.println(c2.equals(c3));
		System.gc();
	}
}