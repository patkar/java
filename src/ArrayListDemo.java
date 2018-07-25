import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("Java");
		ll.add("C++");
		ll.add("php");
		ll.add("python");
		ll.add("c#");
		

		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		Iterator it=ll.iterator();
		
		
		ListIterator lt = ll.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}

}
