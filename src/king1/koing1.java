package king1;

public class koing1 {
	public static void main(String[] args) {
		String k[] = { "98", "88", "78", "66" };
		int sum = 0;
		for (int i = 0; i < k.length; i++) {
			int my = Integer.parseInt(k[i]);
			sum = sum + my;
		}
		System.out.println(sum);
	}
}