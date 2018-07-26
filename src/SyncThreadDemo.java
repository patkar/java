class Restaurant {
	public synchronized void Eat(String name) {
		System.out.print(name);
		System.out.print(" eating");
		System.out.print(" item");
		System.out.print(" dosa,");

	}
}

class RestaurantThread extends Thread {
	String name;
	Restaurant res;

	RestaurantThread(String name, Restaurant res) {
		this.name = name;
		this.res = res;
	}

	public void run() {
		res.Eat(this.name);
	}
}

public class SyncThreadDemo {

	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		RestaurantThread rt = new RestaurantThread("Arvind", r);
		RestaurantThread rt1 = new RestaurantThread("Suraj", r);
		RestaurantThread rt2 = new RestaurantThread("Kunal", r);
		rt.start();
		rt1.setPriority(10);
		rt1.start();
		rt2.start();

	}

}
