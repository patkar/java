import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();
		System.out.println(hs.add("Peter"));
		System.out.println(hs.add("James"));
		System.out.println(hs.add("Arvind"));
		System.out.println(hs.add("Peter"));
		System.out.println(hs);
	}

}
