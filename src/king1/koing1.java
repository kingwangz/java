package king1;

public class koing1 {
	public static void main(String[] args) {
		StringBuilder b = new StringBuilder("holle");
		b.insert(5, " word");
		System.out.println(b);
		b.delete(5, 10);
		System.out.println(b);
	}
}