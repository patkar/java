class A {
	int a = 50;

	public int returnA() {
		return this.a;
	}
}

class B extends A {
	int a = 5;
	int b = 23;
}

class C extends B {
	int a = 35;
}

public class MIDemo {
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.a);
		System.out.println(c1.returnA());
		System.out.println(((A) c1).a);
	}
}
