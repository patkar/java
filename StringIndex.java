
public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sanjay";
		int index=0;
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.indexOf('a',index));
			index=name.indexOf('a',index)+1;
			if(name.indexOf('a',index)==-1)
				break;
		}
		
		
		StringBuffer na=new StringBuffer("Deloitte");
		na.append(" Bangalore");
		
		System.out.println(na);
		System.out.println(na.reverse());
		System.out.println(na.reverse());
		System.out.println(na.insert(0,"India "));
		
		StringBuffer s=new StringBuffer("MALAYALAM");
		System.out.println(s.reverse());
	}

}
