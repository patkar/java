
public class Salary {
public static void main(String[] args) {
	double sal=55555.55, tax=sal*.2, bonus=sal*.15, hup=sal*.15, lunch=sal*.5;
	double save=sal-tax-hup-lunch+bonus;
	System.out.println(save);
}
}
