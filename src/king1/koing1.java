package king1;

public class koing1 {
	koing1() {
		System.out.println("k");
	}
	public static void main(String[] args) {
		koing3 g = new koing3();
	}
}

class koing2 extends koing1 {
	koing2() {
		System.out.println("i");
	}
}

class koing3 extends koing2 {
	koing3() {
		System.out.println("n");
	}
}