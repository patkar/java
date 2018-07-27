import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/");
		String allFiles[] = f.list();
		if (f.canRead())
			System.out.println("readable");
		if (f.canWrite())
			System.out.println("Writable");
		if (f.canExecute())
			System.out.println("Exucatable");
		for (int i = 0; i < allFiles.length; i++) {
			System.out.println(allFiles[i]);	
		}
	}

}
