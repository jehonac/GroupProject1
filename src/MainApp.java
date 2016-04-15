import java.util.Scanner;

public class MainApp {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"What would you like to do? \ntype 1 if you want to encrypt a message. \n Type 2 if you want to decrypt a secret message. ");
		int menuChoice = scan.nextInt();
		if (menuChoice == 1) {
			// System.out.println("Enter a message to be encrypted: ");
			String encryptedMessage = getUserInput();

			String returnMessage = Encryption.encryptMessage(encryptedMessage);

			displayEncryptedText(returnMessage);

		} else if (menuChoice == 2) {
			String decryptedMessage = getUserInput2();
			String returnMessage2 = Decryption.decryptMessage(decryptedMessage);
			displayDecryptedText(returnMessage2);
		}

	}

	public static String getUserInput2() {
		System.out.println("Enter a secret message to be decrypted: ");

		return scan.next();
	}

	public static void displayDecryptedText(String returnMessage2) {
		System.out.println(returnMessage2);

	}

	public static void displayEncryptedText(String msg) {
		System.out.println(msg);

	}

	private static String getUserInput() {
		System.out.println("Enter a message to be encrypted: ");

		return scan.next();
	}

}
