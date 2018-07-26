import java.io.*;

public class StopInput {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String city = null;
		int count=0;
		System.out.println("Enter cities");
		do
		{
			city=br.readLine();
			count++;
		}while(!(city.equalsIgnoreCase("stop")));
		System.out.println("No of cities enterred:"+(count-1));
	}

}
