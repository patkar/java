import java.io.*;

public class WriteFileDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("d:\\arvind.txt");
//		byte a[]= {'w','e','l','c','o','m','e'};
//		fos.write(a);
//		fos.write('h');
//		fos.write('e');
//		fos.write('l');
//		fos.write('l');
//		fos.write('o');
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBytes("hello World \n");
		dos.writeBytes("Another line");
		dos.close();
		
		fos.close();
		System.out.println("File Created");
		
	
	}

}
