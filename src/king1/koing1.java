package king1;

public class koing1 {
	static int avg(int num1, int num2) throws myex {
		if (num1 < 0 || num2 < 0) {
			throw new myex("king");
		}
		if (num1 > 100 || num2 > 100) {
			throw new myex("wang");
		}
		return (num1 + num2) / 2;
	}

	public static void main(String[] args) {
		try {
			int r = avg(102, 122);
			System.out.println("k" + r);
		} catch (myex e) {
			System.out.println(e);
		}
	}
}

class myex extends Exception {
	public myex(String error) {
		super(error);
	}
}