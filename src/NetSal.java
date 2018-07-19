
public class NetSal {
public static void main(String[] args) {
	double sal=15000;
	double tax=sal*.1;
	double allowance=sal*.15;
	double net=(sal-tax)+allowance;
	System.out.println(tax);
	System.out.println("Salary is:"+net);
}
}
