import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String playAgain = "Y";
		Cipher openCaesar = new Cipher();
		// First, ask if they want to encrypt or decrypt
		while (playAgain.equals("Y")) {
			String answer = openCaesar.getEncryptDecrypt();
			JOptionPane.showMessageDialog(null, "main, returned: " + answer);
			switch (answer) {
			case "E":
					System.out.println("You have chosen Encrypt");
					openCaesar.getPlainText();
					openCaesar.getKey();
					openCaesar.encrypt();
				break;
				
			case "D":
				System.out.println("You have chosen Decrypt");
				openCaesar.getEncodedText();
				openCaesar.getKey();
				openCaesar.decrypt();
				break;
				
			}
			playAgain = openCaesar.playAgain();
			// Ask if they want to go again
			// For dev, syso Scanner are fine
			// for ops, change to JOPs -- graded!
		}
		
	}

}
