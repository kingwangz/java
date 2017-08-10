package king1;

public class koing1 {
	void draw() {
		System.out.println("Shape draw.");

	}

	public static void drawInTest(koing1 s) {
		s.draw();
	}

	public static void main(String args[]) {
		Circle c = new Circle();
		drawInTest(c);
	}
}

class Circle extends koing1 {
	void draw() {
		System.out.println("Circle draw.");
	}
}
