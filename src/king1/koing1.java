package king1;

public class koing1 {
	static String s = " a ";

	public static void main(String[] args) {
		koing1 t = new koing1();
		t.method("111 ");
		t.method("222 ");
		t.method("333 ");
		t.method2();
		System.out.println(s);
	}

	public koing1 method(String sb) {
		s += sb;
		return this;
	}

	public void method2() {

		System.out.println(s);
	}

}