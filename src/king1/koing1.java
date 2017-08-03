package king1;

public class koing1 {
	public static void main(String[] args) {
		String s = " we are students";
		int size1 = s.lastIndexOf(" ");
		int size2 = s.indexOf("a");
		char k = s.charAt(5);
		String l = s.substring(0, 5);
		String m = s.trim();
		System.out.println(size1);
		System.out.println(size2);
		System.out.println(k);
		System.out.println(l);
		System.out.println(s.length());
		System.out.println(m.length());
		System.out.println(m);
		String n = s.replace("w", "W");
		System.out.println(n);
		boolean b = s.startsWith(" e");
		boolean b1 = s.endsWith("ts");
		System.out.println(b);
		System.out.println(b1);
	}
}
