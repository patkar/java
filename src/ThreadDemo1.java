class Thread1 extends Thread
{
	public void run()
	{
		for(int i=5;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=15;i<=20;i++)
		{
			System.out.print(i+" ");
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();

t1.start();
t2.start();
	}

}
