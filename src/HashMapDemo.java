import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put("1", "Guru");
		hm.put("2", "Arvind");
		hm.put("3", "Peter");

		System.out.println(hm);
		System.out.println();
		System.out.println(hm.get("2"));

		Set keys = hm.keySet();
		System.out.println();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String e = (String) it.next();
			System.out.println(hm.get(e));
		}
		System.out.println();
		System.out.println(hm.keySet());
	}

}
