package king1;

import static java.lang.System.out;
import java.util.Random;

public class koing1 {
	private static Random rand = new Random();
	private final int a = rand.nextInt(10);
	private static final int a2 = rand.nextInt(10);

	public static void main(String[] args) {
		koing1 fa = new koing1();
		out.println(fa.a);
		out.println(fa.a2);
		koing1 faa = new koing1();
		out.println(faa.a);
		out.println(faa.a2);
	}
}