import java.io.*;

public class InputDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a username:");
		String myName = br.readLine();
		System.out.println("Enter your city:");
		String city = br.readLine();
		System.out.println("Welcome...." + myName);
		System.out.println("your age living in " + city);
	}

}
