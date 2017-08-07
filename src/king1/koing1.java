package king1;

public class koing1 {
	int i = 47;

	public void call() {
		System.out.println("k");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			if (i == 2) {
				System.out.println("\n");
			}
		}
	}

	// public koing1() {
	// }

	public static void main(String[] args) {
		koing1 t1 = new koing1();
		koing1 t2 = new koing1();
		t2.i = 60;
		System.out.println(" " + t1.i++);
		System.out.println(t1.i);
		t1.call();
		System.out.println(" " + t2.i++);
		System.out.println(t2.i);
		t2.call();
	}
}