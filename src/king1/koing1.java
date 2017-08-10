package king1;

public class koing1 {
	public void dot() {
	}

	public static void main(String[] args) {
		dr[] d = { new pa(), new sq() };
		for (int i = 0; i < d.length; i++) {
			d[i].draw();
		}
	}
}

class an extends koing1 {
	public void dot() {
	}
}

interface dr {
	public void draw();
}

class pa extends koing1 implements dr {
	public void draw() {
		System.out.println("king");
	}

	public void dot() {

	}

}

class sq extends koing1 implements dr {
	public void draw() {
		System.out.println("wang");
	}

	public void dot() {

	}

}