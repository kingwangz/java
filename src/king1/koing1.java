package king1;

public class koing1 {
	public static void main(String[] args) {
		i out = new I();
		in outi = out.doit();
		outi.f();
	}
}

interface in {
	public void f();
}

class i {
	private class on implements in {
		on(String s) {
			System.out.println(s);
		}

		public void f() {
			System.out.println("king");
		}
	}

	public in doit() {
		return new on("wang");
	}
}