import java.io.*;

public class AverageInput {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=Integer.parseInt(br.readLine());
		}
		System.out.println("sum="+sum);
		System.out.println("average="+sum/5);
	}

}
