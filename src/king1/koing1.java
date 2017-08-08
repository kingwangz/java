package king1;

import java.math.BigInteger;;

public class koing1 {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("4");
		System.out.println(n.add(new BigInteger("2")));
		System.out.println(n.subtract(new BigInteger("2")));
		System.out.println(n.multiply(new BigInteger("2")));
		System.out.println(n.divide(new BigInteger("2")));
		System.out.println(n.divideAndRemainder(new BigInteger("3"))[1]);
		System.out.println(n.pow(2));
		System.out.println(n.negate());
	}
}