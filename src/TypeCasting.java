class Employee
{
	void m1()
	{
		System.out.println("GrandParent");
	}
}

class HR extends Employee
{
	void m1()
	{
		System.out.println("Child of GP");
	}

}
class Recruiter extends HR
{
	void m1()
	{
		System.out.println("Child of HR");
	}
}
class Financier extends HR
{
	void m1()
	{
		System.out.println("Child of HR");
	}
}

class Technical extends Employee
{
	void m1()
	{
		System.out.println("child of gp");
	}
}
class JavaPm extends Technical
{
	void m1()
	{
		System.out.println("child of tech");
	}
	
}
class MainframePm extends Technical
{
	void m1()
	{
		System.out.println("Child of tech");
	}
	
}


public class TypeCasting {
public static void main(String[] args) {
	Technical t=new JavaPm();
	t.m1();
	
	HR h=new Recruiter();
	h.m1();
	
	Employee e=new HR();
	e.m1();
	
	Employee e1=new MainframePm();
	e1.m1();
}	

}
