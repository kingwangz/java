package king1;

import java.text.DecimalFormat;

public class koing1 {

	public static void main(String[] args) {
		DecimalFormat kDecimalFormat = new DecimalFormat();
		kDecimalFormat.setGroupingSize(2);
		String out = kDecimalFormat.format(1234567.89);
		System.out.println(out);
		kDecimalFormat.setGroupingUsed(false);
		String out2 = kDecimalFormat.format(12345678.78);
		System.out.println(out2);
	}
}