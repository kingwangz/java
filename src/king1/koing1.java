package king1;

import static java.lang.System.out;

public class koing1 {
	class k {
		int y = 0;

		k() {
			out.println("king");
		}

		public void kin() {
			out.println("wang");
		}
	}

	K in = new K();

	public void ouf() {
		in.kin();
	}

	public k doit() {
		in.y = 4;
		return new K();
	}

	public static void main(String[] args) {
		koing1 out = new koing1();
		koing1.K i = out.doit();
		koing1.K i2 = out.new K();
		System.out.println(i);
		System.out.println(i2);
		out.ouf();
	}
}