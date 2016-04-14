import java.util.Scanner;

public class MainApp {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String userInput = getUserInput();
		System.out.println("What would you like to do? \ntype 1 if you want to encrypt a message. \n Type 2 if you want to decrypt a secret message. ");
		
		
		
		

	}

	public static String getUserInput() {

		System.out.println("Enter a message to be encrypted: ");
		String userInput = scan.next();
		return userInput;
	}

	

	public static void displayEncryptedText(String message) {

	}

	public static void displayDecryptedText(String message) {

	}

}
