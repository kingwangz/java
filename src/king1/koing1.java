package king1;

public class koing1 {
	public void n() {
		System.out.println("king");
	}

	public static void a(koing1 q) {
		q.n();
	}

	public static void main(String[] args) {
		k o = new k();
		a(o);
		System.out.println("k" + o);
	}
}

class k extends koing1 {
	public void n() {
		System.out.println("wang");
	}
}