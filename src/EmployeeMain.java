import java.util.*;

import java.util.Scanner;
class EmployeeVo {
	private int empid;
	private String name;
	private double income, incometax;

	public EmployeeVo(int empid, String name, double income) {
		super();
		this.empid = empid;
		this.name = name;
		this.income = income;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getIncometax() {
		return incometax;
	}

	public void setIncometax(double incometax) {
		this.incometax = incometax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(income);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(incometax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
			return false;
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(incometax) != Double.doubleToLongBits(other.incometax))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "employeeVo [empId=" + empid + ", empName=" + name + ", annualIncome=" + income + ", incomeTax="
				+ incometax + "]";
	}

}

class EmployeeBo {
	public void calIncomeTax(EmployeeVo eVo) {
		eVo.setIncometax(eVo.getIncome() * 0.1);
	}
}

class EmployeeSort implements Comparator<EmployeeVo> {

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		return (int) (o2.getIncometax() - o1.getIncometax());
	}

}

public class EmployeeMain {
	public static void main(String[] args) {
		int empId = 0;
		String empName = null;
		double annualIncome = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Employee: ");
		int n = sc.nextInt();
		EmployeeBo cal = new EmployeeBo();
		ArrayList<EmployeeVo> employeeVo = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			System.out.print("Employee ID: ");
			empId = sc.nextInt();
			System.out.print("Employee Name: ");
			empName = sc.next();
			System.out.print("Annual Income: ");
			annualIncome = sc.nextDouble();
			employeeVo.add(new EmployeeVo(empId, empName, annualIncome));
			cal.calIncomeTax(employeeVo.get(i));
		}
		for (EmployeeVo e : employeeVo)
			System.out.println(e);
		Collections.sort(employeeVo, new EmployeeSort());
		System.out.println("After Sorting: ");
		for (EmployeeVo e : employeeVo)
			System.out.println(e);
		sc.close();
	}
}
