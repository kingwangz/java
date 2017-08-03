package king1;

public class koing1 {
	public static void main(String[] args) {
		String s = "klk.klk.dff";
		String[] f = s.split("\\.");
		String[] k = s.split("\\.", 2);
		for (String a : f) {
			System.out.println(a);
		}
		for (String a : k) {
			System.out.println(a);
		}
	}
}
