package king1;

import java.text.DecimalFormat;

public class koing1 {
	static public void k(String pattern, double value) {
		DecimalFormat my = new DecimalFormat(pattern);
		String out = my.format(value);
		System.out.println(value + " " + pattern + " " + out);
	}

	static public void n(String pattern, double value) {
		DecimalFormat my = new DecimalFormat();
		my.applyPattern(pattern);
		System.out.println(value + " " + pattern + " " + my.format(value));
	}

	public static void main(String[] args) {
		k("###,###.###", 12346.789);
		k("0000000.######kg", 12345678.98);
		k("0000.000", 122.34);
		n("#.##%", 0.789);
		n("000.###", 123456.78);
		n("0.00\u2030", 0.789);
	}
}