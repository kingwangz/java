package king1;

import java.math.BigDecimal;

public class koing1 {
	static final int lo = 10;

	public BigDecimal add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2);
	}

	public BigDecimal sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2);
	}

	public BigDecimal mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2);
	}

	public BigDecimal div(double v1, double v2) {
		return div(v1, v2, lo);
	}

	public BigDecimal div(double v1, double v2, int b) {
		if (b < 0) {
			System.out.println("k");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP);
	}

	public static void main(String[] args) {
		koing1 n = new koing1();
		System.out.println(n.add(-7.5, 8.9));
		System.out.println(n.sub(-7.5, 8.9));
		System.out.println(n.mul(-7.5, 8.9));
		System.out.println(n.div(10, 2));
		System.out.println(n.div(-7.5, 8.9, 5));

	}
}