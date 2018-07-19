public class Car {
	String carName;
	double milage,price;
	boolean isLux;
	public Car(String carName, double milage, double price, boolean isLux) {
		super();
		this.carName = carName;
		this.milage = milage;
		this.price = price;
		this.isLux = isLux;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", milage=" + milage + ", price=" + price + ", isLux=" + isLux + "]";
	}
	static public void chooseMyCar(Car c[])
	{
		for(int i=0;i<c.length;i++) {
			if(c[i].milage>=10.0 && c[i].price<=23000)
			{
				System.out.println(c[i].toString());
			}
		}
	}
}