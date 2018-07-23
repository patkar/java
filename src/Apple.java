
public class Apple {
String source;
double price;
public Apple(String source, double price) {
	super();
	this.source = source;
	this.price = price;
}
public void Compare(Apple a1, Apple a2) {
	// TODO Auto-generated method stub
	if (a1.price>a2.price) 
		System.out.println(a1.price +"is greater");
	else
		System.out.println(a2.price +"is greater");
		
}
}
