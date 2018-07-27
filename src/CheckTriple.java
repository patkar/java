import java.util.Scanner;

class Triple
{
	public static boolean TrippleCheck(int a[])	{
		if(a.length<0)
			return false;
		int flg=0;
		int pre=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==pre) {
				flg++;
				if(flg==2)
					return true;
			}
			else {
				pre=a[i];	
				flg=0;
			}
		}
		return false;
	}
}

public class CheckTriple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(Triple.TrippleCheck(a));
		sc.close();
	}
}
