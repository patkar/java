import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

abstract class Arithmetic {
	int num1;
	int num2;

	public Arithmetic(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;

	}

	public abstract int calculate();

}

class Addition extends Arithmetic {

	public Addition(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int calculate() {
		return (num1 + num2);
	}

}

class Subtraction extends Arithmetic {

	public Subtraction(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int calculate() {
		return (num1 - num2);
	}

}

class Multiplication extends Arithmetic {

	public Multiplication(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int calculate() {
		return (num1 * num2);
	}

}

class Division extends Arithmetic {

	public Division(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int calculate() {
		return (num1 / num2);
	}

}

public class TestCalculator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("1.Add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("Enter your Choice:");
		char ch=(char) Integer.parseInt(br.readLine());
		

		
		Arithmetic ad = new Addition(n1, n2);
		Arithmetic sb = new Subtraction(n1, n2);
		Arithmetic ml = new Multiplication(n1, n2);
		Arithmetic di = new Division(n1, n2);
		
		Arithmetic a[]= {ad,sb,ml,di};
		
		int ele=(ch==1)?0:(ch==2)?1:(ch==3)?2:(ch==4)?3:4;
		Arithmetic ar=a[ele];
		
		System.out.println("res:" + ar.calculate());
		sc.close();
	
	}

}
