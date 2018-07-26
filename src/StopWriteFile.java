import java.io.*;
public class StopWriteFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("d:\\myinput.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s=br.readLine();
		while(!(s.equalsIgnoreCase("Stop")))
		{
			bw.write("\n"+s);
			s=br.readLine();
		}
		bw.close();
		fw.close();
		System.out.println("Success");
	}

}
