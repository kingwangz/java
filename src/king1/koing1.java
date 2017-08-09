package king1;

public class koing1 {
	private String username;
	private String password;

	public koing1() {

	}

	public koing1(String name, String password) {
		this.username = name;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {

		koing1 u = new koing1();
		System.out.println("用户名：" + u.username);
		System.out.println("密码：" + u.password);

		koing1 k = new koing1("zhangsan", "123456");
		System.out.println("用户名：" + k.username);
		System.out.println("密码：" + k.password);

		k.setUsername("lisi");
		k.setPassword("654321");
		System.out.println("用户名：" + k.getUsername() + u.getUsername());
		System.out.println("密码：" + k.getPassword() + u.getPassword());
	}
}