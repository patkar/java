import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		StringBuffer p=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			p.append(s.charAt(i));
		}
		System.out.println(p);
		
		
//		for(int i=0;i<str.lrn();i++)
//			for(int i=str.len-1;i>=0;i--)
//				sop(str.charat(i);)
		sc.close();
	}

}
