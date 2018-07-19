public class TestCar {
	public static void main(String[] args) {
		Car c[]= new Car[5];
		c[0] = new Car("Car1",60.0,500000,false);
		c[1] = new Car("Car2",30.0,50000,true);
		c[2] = new Car("Car3",25.0,400000,false);
		c[3] = new Car("Car4",10.0,5000,true);
		c[4] = new Car("Car5",9.0,2300,true);
		Car max = c[0];
		for(Car car : c){
			System.out.println(car);
			if(car.price>max.price) 
				max=car;
		}
		System.out.println("\nCostliest Car: ");
		System.out.println(max);
		
		System.out.println("\nSelected Cars: ");
		Car.chooseMyCar(c);
		
		
	}
}