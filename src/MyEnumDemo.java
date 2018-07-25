
public class MyEnumDemo {
	enum weekday {
		sun, mon, tue, wed, thur, fri, sat
	}

	public static void main(String[] args) {
		weekday[] w = weekday.values();
		for (weekday w1 : w)
			System.out.println(w1);
	}
}
