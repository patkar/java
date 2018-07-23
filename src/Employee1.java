
public class Employee1 {
String name;
double salary;
public Employee1(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public void Compare(Employee1 e1, Employee1 e2) {
	// TODO Auto-generated method stub
	if (e1.salary>e2.salary) 
		System.out.println(e1.salary +"is greater");
	else
		System.out.println(e2.salary +"is greater");
		
}
}
