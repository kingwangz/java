package king1;

public class koing1 {
	private koing1[] p = new koing1[6];
	private int n = 0;

	public void draw(koing1 q) {
		if (n < p.length) {
			p[n] = q;
			System.out.println(n + p.length + q);
			n++;
		}
	}

	public static void main(String[] args) {
		koing1 q = new koing1();
		q.draw(new k());
		q.draw(new sk());
	}
}

class sk extends koing1 {
	public sk() {
		System.out.println("king");
	}
}

class k extends koing1 {
	public k() {
		System.out.println("wang");
	}
}