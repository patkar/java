
public class TestFurniture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cot c=new cot();
c.price=25000;
chair cc=new chair();
cc.price=30000;
Furniture f=new Furniture();
double cotDiscount=f.calculateDiscount(c);
System.out.println(cotDiscount);

	}

}
