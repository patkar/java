
public class Band {
private String bandName;
private String singer[];
private String guitar[];
private String drummer;
private String keyboard;
int num;
public String getBandName() {
	return bandName;
}
Band(String bandName,String singer[],String guitar[],String drummer,String Keyboard)
{
	this.bandName=bandName;
	this.singer=singer;
	this.guitar=guitar;
	this.drummer=drummer;
	this.keyboard=Keyboard;
	
	
}
public void printBand()
{
	num=2;
	System.out.println();
	System.out.print("Band Name:"+this.bandName);
	System.out.println();
	System.out.print("Singers:");
	for(int i=0;i<singer.length;i++)
	{
		System.out.print(singer[i]);
		num++;
	}
	System.out.println();
	System.out.print("guitar:");
	for(int i=0;i<guitar.length;i++)
	{
		System.out.print(guitar[i]);
		num++;
	}
	System.out.println();
	System.out.print("drummer:"+this.drummer);
	System.out.println();
	System.out.print("keyboard:"+this.keyboard);
}

}
