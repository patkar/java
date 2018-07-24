
public class ReadingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company="Deloitte 123&$";
//		for(Character c:company.toCharArray())
		{
//			if(Character.isDigit(c))
//				System.out.println("Character is digit");
//			else if(Character.isWhitespace(c))
//				System.out.println("Character is space");
//			else if(Character.isAlphabetic(c))
//				System.out.println("Character is Letter");
			
		}	
			
			char cArray[]=company.toCharArray();
			for(int i=0;i<cArray.length;i++)
			{
				char x=cArray[i];
				if(Character.isDigit(x))
					System.out.println(x+"is a digit");
				else if(Character.isWhitespace(x))
					System.out.println(x+"is a spce");
				else if(Character.isLetter(x))
					System.out.println(x+"is a letter");
				else
					System.out.println(x+"is a special char");
					
			}
		}
	}

