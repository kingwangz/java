package king1;

public class koing1 {
	public static void main(String[] args) {
		look: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 4) {
					break look;
				}
				System.out.println("i=" + i + "j=" + j);
			}
		}
	}
}
