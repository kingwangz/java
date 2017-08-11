package king1;

import static java.lang.System.out;

public class koing1 {

	public static void main(String[] args) {
		w o = new W();
		o.d();
		k p = o;
		p.d2();
		p.d3();

	}
}

class k {
	private final void d() {
		out.println("king");
	}

	final void d2() {
		out.println("king2");
	}

	public void d3() {
		out.println("king3");
	}
}

class w extends k {
	public final void d() {
		out.println("wang");
	}

	/*
	 * final void d2() { out.println("wang2"); }
	 */

	public void d3() {
		out.println("wang3");
	}
}