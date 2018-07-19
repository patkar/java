
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Band b=new Band("Roxks",new String[] {"anfal","jason"},new String[] {"viraj","akarsh"},"Kiran","sudindra");
b.printBand();
Band b1=new Band("buddy",new String[] {"suraj","ankush"},new String[] {"hari","sushanth,arvind"},"vignesh","aditya");
b1.printBand();
if(b1.num>b.num)
		System.out.println("artists in b1 are more");
else
	System.out.println("artists in b2 are more");
	}

}
