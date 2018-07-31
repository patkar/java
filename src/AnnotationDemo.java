class Places implements Cloneable
{
	String name;
	String country;
	long population;
	public Places(String name, String country, long population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		Places p1=new Places("kashmir","India",12000);
		Places p2=null;
		try {
			p2=(Places)p1.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("Cloning not available for this object");
			e.printStackTrace();
		}
		p1.country="USA";
		System.out.println(p1.country);
		System.out.println(p2.country);
	}

}
