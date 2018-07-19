
public class SmallArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,50,2,5,55,25};
int smal=arr[0];
for(int i=0;i<arr.length;i++)
{
	if(arr[i]<smal)
		smal=arr[i];
}
System.out.println("Smallest Num in array is "+smal);
	}

}
