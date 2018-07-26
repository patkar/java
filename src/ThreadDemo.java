class NumberThread extends Thread
{
	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++)
		{
			System.out.print(i+" ");
		}
	}
}

class AlphaThread extends Thread
{
	public void run()
	{
		//System.out.println();
		//System.out.println(Thread.currentThread().getName());
		for(char c='A';c<='E';c++)
		{
			System.out.print(c+" ");
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) {

		AlphaThread at=new AlphaThread();
		NumberThread nt=new NumberThread();
		nt.setName("Number");
		at.setName("Alphabet");
		nt.start();
		at.start();
		

	}

}
