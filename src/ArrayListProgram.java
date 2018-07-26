import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("5");
		list.add("4");
		list.add("3");
		list.add("2");
		list.add("1");
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("5");
		list2.add("6");
		list2.add("3");
		list2.add("9");
		list2.add("1");
		
		list.retainAll(list2);

	System.out.println(list);
	}

}
