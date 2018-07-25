import java.util.*;
public class CollectionFrame {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Anfal");
	al.add("Abhijith");
	
	int ind=al.indexOf("Anfal");
	if(ind!=-1)
	{
		al.remove(ind);
		al.add(ind, "Sanju");
	}
	else
		System.out.println("Anfal not found");
	
//	for(int i=0;i<al.size();i++)
//	{
//		al.get(i);
//	}
	
	System.out.println(al);
}
	
}
