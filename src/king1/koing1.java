package king1;

public class koing1 {
	static int avg(int num1, int num2) throws myex {
		if (num2 < 0) {
			throw new myex("king");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {
		try {
			int r = avg(3, -1);
			System.out.println("k" + r);
		} catch (myex e) {
			System.out.println(e.get());
		}
	}
}

class myex extends Exception {
	String mess;

	public myex(String error) {
		mess = error;
	}

	public String get() {
		return mess;
	}
}