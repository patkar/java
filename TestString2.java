
public class TestString2 {

	public static void main(String[] args) {
		int c = 0;
		for (int i = 0; i < args[0].length(); i++) {

			if (args[0].charAt(i) == 'c')
				c++;
		}
		System.out.println(c);
		
	}

}
