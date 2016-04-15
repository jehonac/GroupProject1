import java.util.*;

public class Encryption {
	public static String encryptMessage(String sInput) {
		// String sInput = "Kobe is the man";
		ArrayList<Integer> encodedMessage = new ArrayList<Integer>();
		char[] indvLetters = sInput.toCharArray();
		int temp;
		for (int i = 0; i < indvLetters.length; i++) {
			temp = ((int) indvLetters[i] * 7);
			encodedMessage.add(temp);
		}
		
		return encodedMessage.toString();
	}
}
