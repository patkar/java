
public class CountryCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String country[]= {"india","srilanka","america"};
String cap[]= {"Delhi","colombo","washington"};
String countrya="america";
int pos=-1;
for(int i=0;i<country.length;i++)
{
	if(country[i]==countrya)
		pos=i;
}
System.out.println("Capital is "+cap[pos]);
	}

}
