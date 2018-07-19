
public class SumArray {
	public static void main(String[] args) {
		int arr[]= {12,50,2,5,55,25};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("sum is "+sum);
		int evensum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				evensum+=arr[i];
		}
		System.out.println("even sum="+evensum);
	}

}
