package king1;

public class koing1 {
	public static void main(String[] args) {
		try {
			String str = "ill";
			System.out.println(str);
			int age = Integer.parseInt("20k");
			System.out.println(age);
		} catch (Exception e) {
			e.printStackTrace();
			e.toString();
			e.getMessage();
		}finally {
			System.out.println("wang");
		}
		System.out.println("king");
	}
}