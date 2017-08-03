package king1;

public class koing1 {
	public static void main(String[] args) {
		String r = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String a = "aaa@";
		String a1 = "aaaa";
		String a2 = "111@qq.com.cn";
		if (a.matches(r)) {
			System.out.println("pass1");
		}
		if (a1.matches(r)) {
			System.out.println("pass2");
		}
		if (a2.matches(r)) {
			System.out.println("pass3");
		}
	}
}