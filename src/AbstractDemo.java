abstract class person1
{
	public boolean doesHeBreath()
	{
		System.out.println("every person breathes");
		return true;
	}
	public boolean doesHeSleep()
	{
		System.out.println("every person sleeps");
		return true;
	}
	public abstract boolean doesHeDriveCar();
}
abstract class Employee2 extends person1
{
	public abstract boolean doesHeDriveCar();
}
class Driver extends Employee2
{
	@Override
	public boolean doesHeDriveCar()
	{
		System.out.println("Every driver drives");
		return true;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Driver d=new Driver();
		System.out.println("Breathing?"+d.doesHeBreath());
		System.out.println("Sleeping?"+d.doesHeSleep());
		System.out.println("Driving?"+d.doesHeDriveCar());
	}

}
