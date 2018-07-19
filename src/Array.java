
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {45,26,66,78,92};
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println();
for(int i=arr.length-1;i>=0;i--)
{
		System.out.print(arr[i]+" ");
}
System.out.println();
boolean b=false;
int pos=-1;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==26) {
		b=true;
		pos=i;
	break;
	}
}
if (b)
	System.out.println("found 26 in "+pos);
else
	System.out.println("26 not found");
	}

}
