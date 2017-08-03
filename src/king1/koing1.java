package king1;

public class koing1 {
	public static void main(String[] args) {
		String d = "";
		long stime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			d = d + i;
		}
		long etime = System.currentTimeMillis();
		long time = etime - stime;
		System.out.println(time);
		StringBuilder builder = new StringBuilder("");
		stime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			builder.append(i);
		}
		etime = System.currentTimeMillis();
		time = etime - stime;
		System.out.println(time);
	}
}