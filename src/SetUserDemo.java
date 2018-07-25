import java.util.HashSet;

class MobilePhone {
	String mobileName;
	int price;

	public MobilePhone(String mobileName, int price) {
		super();
		this.mobileName = mobileName;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.mobileName + " " + this.price;
	}

	@Override
	public boolean equals(Object obj) {
		MobilePhone mm = (MobilePhone) obj;
		if (this.mobileName.equals(mm.mobileName) && this.price == mm.price)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return this.price*5;

	}
	
}

public class SetUserDemo {

	public static void main(String[] args) {
		MobilePhone mp1 = new MobilePhone("Samsung", 111);
		MobilePhone mp2 = new MobilePhone("Samsung", 111);
		MobilePhone mp3 =new MobilePhone("Samsung",123);
		HashSet<MobilePhone> hs = new HashSet<MobilePhone>();
		hs.add(mp1);
		hs.add(mp2);
		hs.add(mp3);

		System.out.println(hs);

	}

}
