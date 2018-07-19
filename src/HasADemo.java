class employee12
{
	double salary;
	String name;
	int eid;
	String dept;
	address add;
	
	employee12(double salary,String name,int eid,String dept,address add)
	{
		this.salary=salary;
		this.name=name;
		this.eid=eid;
		this.add=add;
	}
	
	public void printEmployeeDetails()
	{
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println(this.eid);
		add.prindAddressDetails();
	}
}
class address
{
	int flatNo;
	String street;
	String main;
	String cross;
	String apartmentname;
	long pincode;
	
	address(int flatNo,String street, String main, String cross, String apartmentname,long pincode) {
		super();
		this.flatNo=flatNo;
		this.street = street;
		this.main = main;
		this.cross = cross;
		this.apartmentname = apartmentname;
		this.pincode=pincode;
	}

	public void prindAddressDetails()
	{
		System.out.println(this.flatNo);
		System.out.println(this.street);
		System.out.println(this.main);
		System.out.println(this.cross);
		System.out.println(this.apartmentname);
		System.out.println(this.pincode);
	}
}
public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
address a=new address(112,"Shanthinikethan","7th Main","8th Cross","Mumbai0",560009l);
employee12 e=new employee12(12345.6,"Peter",123,"Finance",a);
e.printEmployeeDetails();
	}

}

