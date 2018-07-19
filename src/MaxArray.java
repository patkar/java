
public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 50, 2, 5, 55, 25 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Max in array is " + max);
	}

}
