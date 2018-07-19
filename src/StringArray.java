
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"arvind","viraj","anfal","guru","jason"};
boolean b=false;
int pos=0;
for(int i=0;i<arr.length;i++)
{

	
	if(arr[i]=="guru")
		{
		pos=i;
	b=true;
		break;}
		
}
if(b)
System.out.println("Guru is found at pos "+ pos);
else
System.out.println("Not found");
	}

}
