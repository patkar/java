import java.io.*;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// FileInputStream fis = new FileInputStream("hello.txt");
		// int x = fis.read();
		// while (x != -1) {
		// System.out.print((char)x);
		// x = fis.read();
		// }
		// fis.close();

		FileReader fr = new FileReader("hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int flag = 0;
		while (line != null) {
			// System.out.println(line);
			if (line.contains("java")) {
				flag = 1;
				break;
			}
			line = br.readLine();
		}
		if (flag == 1)
			System.out.println("found");
		else
			System.out.println("Not found");
		fr.close();
	}

}
