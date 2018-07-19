
public class Mobile {

		String brandName;
		double price;
		String color;
		int resolution;
		
		public void makeACall()
		{
			System.out.println("Please wait...Connecting");
		}
		public void recieveACall()
		{
			
		}
		public void sendAText()
		{
			
		}
		public double discount()
		{
			double dis =0.0;
			if(this.brandName.equals("Samsung"))
				dis = this.price*.1;
			else if(this.brandName.equals("Moto"))
				dis= this.price*.15;
			return dis;
		}
}
