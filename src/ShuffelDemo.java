import java.util.*;

public class ShuffelDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(7);
		al.add(4);
		// al.add(5);
		// al.add(6);
		// al.add(3);
		// al.add(10);
		// al.add(9);
		// al.add(8);
		System.out.println("Before Shuffeling" + al);
		System.out.println();
		Collections.shuffle(al);
		System.out.println("After Shuffeling" + al);
		System.out.println();
		System.out.println("MAX:" + Collections.max((al)));
		System.out.println("MIN:" + Collections.min((al)));

		Collections.sort(al);
		System.out.println("Sorting" + al);
		System.out.println();
		System.out.println("Binary Search:" + Collections.binarySearch(al, 5));
		System.out.println();
		ArrayList b = new ArrayList();
		b.add(11);
		b.add(12);
		b.add(13);
		b.add(14);

		Collections.copy(al, b);
		System.out.println("Copied" + b);
		System.out.println("After Copieng"+al);
		
		Collections.fill(al, 1);
		System.out.println("After filling:"+al);
		
		Enumeration e=Collections.enumeration(b);
		al=Collections.list(e);
		System.out.println("After Enumumerstion:"+al);
		
		Collections.reverse(al);
		System.out.println("Reverse:"+al);
		
		Collections.swap(al, 2, 3);
		System.out.println("Swap:"+al);
		
	}

}
