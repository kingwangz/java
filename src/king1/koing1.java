package king1;

public class koing1 {
	private int x;

	private class in {
		private int x = 9;

		public void doit(int x) {
			x++;
			this.x++;
			koing1.this.x++;
		}
	}

	in w = new in();

	public void e() {
		W.doit(0);
		System.out.println(+W.x);
	}

	public static void main(String[] args) {
		koing1 p = new koing1();
		p.e();
		p.x = 1;
		System.out.println(+p.x);

	}
}
