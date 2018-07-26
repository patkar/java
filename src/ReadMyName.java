import java.io.*;

public class ReadMyName {

	public static void main(String[] args) throws IOException {
		// System.out.println("Enter a char:");
		// int x=System.in.read();
		// System.out.println("u have entered:"+(char)x);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a username:");
		String myName = br.readLine();
		System.out.println("Welcome...." + myName);
		System.out.println("Enter your age:");
		int age = Integer.parseInt(br.readLine());
		System.out.println(myName + " your age is " + age);
	}

}
