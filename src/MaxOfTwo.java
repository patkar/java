import java.util.Scanner;

public class MaxOfTwo {
	public static void main(String[] args) {
		
		
		
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1==0 && num2==0)
			System.out.println("Both cannot be zero");
		else if (num1>num2)
			System.out.println("The Biggest num is="+num1);
			else if(num2>num1)
				System.out.println("The Biggest num is="+num2);
			else
				System.out.println("Both are equal");
		sc.close();
	}

}
