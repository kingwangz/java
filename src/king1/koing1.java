package king1;

import java.util.Date;

public class koing1 {
	public static void main(String[] args) {
		Date date = new Date();
		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		String hour = String.format("%tH", date);
		String minute = String.format("%tM", date);
		String second = String.format("%tS", date);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		String time = String.format("%tc", date);
		String form = String.format("%tF", date);
		System.out.println(time);
		System.out.println(form);
	}
}
