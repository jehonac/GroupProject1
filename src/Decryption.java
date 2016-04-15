
public class Decryption {

	//public static void main(String[] args) {
		//String inputString = "728, 707, 756, 756, 777";
		//decryptMessage(inputString);
	//}

	public static String decryptMessage(String userInput) {
		String[] encryptedAlphabet = userInput.split(",");
		
		char[] decryptedMessage = new char[encryptedAlphabet.length];
		for (int i = 0; i<encryptedAlphabet.length; i++) {
			decryptedMessage[i] = (char) (Integer.parseInt(encryptedAlphabet[i].trim()) / 7);
		}
		System.out.println(new String(decryptedMessage));
	
		return new String(decryptedMessage);
	}


}
