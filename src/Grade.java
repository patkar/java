
public class Grade { 
	double total, percent;
	public String grade() {
		if (this.percent >=90)
			return "A";
		else if (this.percent >79 && this.percent < 90)
			return "B";
		else if (this.percent >= 70 && this.percent <= 79)
			return "c";
		else
		return "D";
	}
	public String result(int m1,int m2,int m3)
	{
		if(m1>=35 && m2>=35 && m3>=35)
		{
			return "Pass";
		}
		else
			return "Fail";
	}
}
