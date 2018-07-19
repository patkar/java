

public class Highest {
public static void main(String[] args) {
	int prod[]= {28,65,78,45,88};
	int max=prod[0];
	for(int i=1;i<5;i++)
	{
		if(prod[i]>max)
			max=prod[i];
	}
	System.out.println(max);
}
}
