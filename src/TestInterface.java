
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e1=new Employee1("emp1",25000.00);
Employee1 e2=new Employee1("emp2",35000.00);
Employee1 e3=new Employee1(null,0);
e3.Compare(e1,e2);

Apple a1=new Apple("Kashmin",2343.22);
Apple a2=new Apple("Washington",33333.22);
Apple a3=new Apple(null,0);
a3.Compare(a1, a2);
	}

}
