class Greeting
{
	public synchronized void sayHello(String name)
	{
		System.out.print("!");
		System.out.print(name);
		System.out.print("!");
	}
}
class GreetingThread extends Thread
{
	String name;
	Greeting greeting;
	
	GreetingThread(String name,Greeting greeting){
		this.name=name;
		this.greeting=greeting;
	}
	public void run()
	{
		greeting.sayHello(this.name);
	}
}
public class SynchronizeDemo {

	public static void main(String[] args) {
//Greeting g=new Greeting();
//Greeting g1=new Greeting();
//g.sayHello("guru");
//g.sayHello("varun");
		Greeting g=new Greeting();
		GreetingThread gt=new GreetingThread("Mayur",g);
		GreetingThread gt1=new GreetingThread("Varun",g);
		GreetingThread gt2=new GreetingThread("Akash",g);
		GreetingThread gt3=new GreetingThread("Suraj",g);
		gt.start();
		gt1.start();
		gt2.start();
		gt3.start();
		
	}

}
