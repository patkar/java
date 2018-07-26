import java.io.*;
public class WriteFileDemo1 {

	public static void main(String[] args) throws IOException {
FileWriter fw=new FileWriter("d:\\hello.txt");
BufferedWriter br=new BufferedWriter(fw);

br.write("First Line");
br.newLine();
br.write("Second Line");
br.close();
fw.close();
System.out.println("Success");
	}

}
