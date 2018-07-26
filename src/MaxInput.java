import java.io.*;

public class MaxInput {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int Max=0;
		int n;
		for(int i=0;i<5;i++)
		{
			n=Integer.parseInt(br.readLine());
			if(n>Max)
				Max=n;
		}
		System.out.println("Max of Numbers:"+Max);
		
	}

}
