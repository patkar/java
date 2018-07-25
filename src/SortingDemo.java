import java.util.*;

class Cars implements Comparable
{
	String color;
	String brand;
	double price;
	
	public Cars(String color, String brand, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return this.brand+" "+this.color+" "+this.price;
	}
	@Override
	public int compareTo(Object o) {
//		int retval=0;
//		
		Cars cc=(Cars)o;
//		if (this.price==cc.price)
//			retval=0;
//		else if(this.price<cc.price)
//			retval=-1;
//		else if(this.price>cc.price)
//			retval=1;
//		return retval;
		//return (int)(this.price-cc.price);
		//return this.brand.compareTo(cc.brand);
		return this.color.compareTo(cc.color);
	}
	
}

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<Cars> al=new ArrayList<Cars>();
		Cars c1=new Cars("Silver","Audi",85755.45);
		Cars c2=new Cars("Green","Susuki",54645.64);
		Cars c3=new Cars("Red","BMW",8453.54);
		
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
	}

}
