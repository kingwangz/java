package king1;

public class koing1 {
	private String name;

	public static void main(String[] args) {
		koing1 s = new koing1();
		s.getname();
		System.out.println(s.getname());
	}

	public String getname() {
		int id = 0;
		setname("java");
		System.out.println(name);
		return id + this.name;
	}

	public void setname(String name) {
		this.name = name;

	}

	public koing1 nambookname() {
		return this;

	}
}