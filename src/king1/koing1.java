package king1;

public class koing1 {
	public on dot() {
		return new on() {
			private int i = 0;
			public int get() {
				return i;
			}
		};
	}

	public static void main(String[] args) {
		koing1 pKoing1 = new koing1();
		pKoing1.dot();
	}
}

interface on {

}