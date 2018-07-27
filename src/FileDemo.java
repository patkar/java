import java.io.*;

public class FileDemo {

	public static void main(String[] args) throws IOException {
//		File f = new File("D:/myFile");
//		Boolean created = f.createNewFile();
//		if (created == true)
//			System.out.println("Created");
//		else
//			System.out.println("Problem");

//		File f = new File("D:/Foleder1");
//		Boolean status = f.mkdir();
//		if (status)
//			System.out.println("Folder Created");
//		else
//			System.out.println("Problem");
		
		File f = new File("D:/myFile");
		if (f.exists()) {
			System.out.println("File exists");
			boolean dstatus = f.delete();
			if (dstatus)
				System.out.println("successfully deleted");
			else
				System.out.println("Already deleted");
		} else {
			System.out.println("File dosent exists");
			boolean cstatus = f.createNewFile();
			if (cstatus)
				System.out.println("Successfully created");
			else
				System.out.println("Problem creating file");
		}

	}

}
