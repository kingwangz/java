package king1;

import static java.lang.System.out;

public class koing1 {
	public int u = 0;

	class k {
		int y = 0;

		k() {
			out.println("king");
			//u=8;
		}

		public void kin() {
			out.println("wang");
		}

		public void l() {
			u = 9;
		}

	}

	K in = new K();

	public void ouf() {
		in.kin();
	}

	public k doit() {
		in.y = 4;
		// u=9;
		in.l();
		out.println(+in.y);
		return new K();
	}

	public static void main(String[] args) {
		koing1 out = new koing1();
		koing1.K i = out.doit();
		koing1.K i2 = out.new K();
		System.out.println(i);
		System.out.println(i2);
		System.out.println(+out.u);
		int l = i.y;
		System.out.println(l);
	}
}