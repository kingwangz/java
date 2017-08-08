package king1;

public class koing1 {
	public koing1() {
	}

	protected void n() {
	}

	protected koing1 e() {
		return new koing1();
	}

	public static void main(String[] args) {
		koing1 k = new koing1();
		k.e();
	}

	class koing2 extends koing1 {
		public koing2() {
			super();
			super.n();
		}

		public void na() {
		}

		public void n() {
		}

		protected koing2 e() {
			return new koing2();
		}

	}
}