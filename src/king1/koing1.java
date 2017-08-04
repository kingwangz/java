package king1;

public class koing1 {
	public static void main(String[] args) {
		int b[][] = new int[10000][10000];
		long stime = System.currentTimeMillis();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		long etime = System.currentTimeMillis();
		long time = etime - stime;
		System.out.println(time);

	}
}