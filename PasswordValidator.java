
public class PasswordValidator {
	public static void main(String[] args) {
		String pass = "Arvind@9";
		boolean digit = false, special = false, upper = false, white = false;
		char password[] = pass.toCharArray();
		for (int i = 0; i < password.length; i++) {
			char x = password[i];
			if (Character.isDigit(x))
				digit = true;
			else if(Character.isLetter(x)){
			 if (Character.isUpperCase(x))
				upper = true;
			}
			else if (Character.isWhitespace(x))
				white = true;
			else
				special = true;
		}
		if (password.length < 5 || password.length > 10)
			System.out.println("password should be between 5 to 10 char");
		else if (white == true)
			System.out.println("Should not contain space");
		else if (digit == false)
			System.out.println("Should contain digit");
		else if (special == false)
			System.out.println("should contail special");
		else if (upper == false)
			System.out.println("should contain upper");
		else
			System.out.println("Password accepted");
	}
}
