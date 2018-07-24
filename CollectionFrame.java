import java.util.*;
public class CollectionFrame {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
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
//		System.out.println(al);
//	}
	
	System.out.println(al);
}
	
}
