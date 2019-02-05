import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cipher {
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:";
	private String plainText = "";
	private String encodedText = "";
	private String decodedText = "";
	int shift = 1;
	private String answer = "";
	private int key = 0;
	Scanner kbd = new Scanner(System.in);

	public void getPlainText() {
		plainText = JOptionPane.showInputDialog("Please Enter the Plain text message");
		plainText = plainText.toLowerCase();;
		
	}

	public void getKey() {
		key = Integer.parseInt(JOptionPane.showInputDialog("Please enter the shift key"));
		
	}

	public void encrypt() {
		String encodedText = "";
		for (int i = 0; i < plainText.length(); i++) {
			if (!alpha.contains(String.valueOf(plainText.charAt(i)))) {
				encodedText += " ";
				
			} else {
				encodedText += alpha.charAt((alpha.indexOf(plainText.charAt(i)) + key) % alpha.length());
				
			}

		}
		JOptionPane.showMessageDialog(null, encodedText);
		
	}
	
	public String playAgain() {
		while (true) {
			String playAgain = JOptionPane.showInputDialog("Do you want to play again? (y / n)");
			playAgain = String.valueOf(playAgain.charAt(0)).toUpperCase();
			if (playAgain.equals("Y") || playAgain.equals("N")) {
				return playAgain;
				
			} else {
				JOptionPane.showMessageDialog(null, "That is not yes or no! Try again.");
				
			}
			
		}
		
		
	}

	public String getEncryptDecrypt() {
		while (true) {
			String answer = JOptionPane.showInputDialog("Do you want to encypt or decrypt (e / d)");
			answer = String.valueOf(answer.charAt(0)).toUpperCase();
			if (answer.equals("E") || answer.equals("D")) {
				return answer;
				
			} else {
				JOptionPane.showMessageDialog(null, "That is not encrypt or decrypt. Try again.");
				
			}
			
		}
		
	}

	public void getEncodedText() {
		encodedText = JOptionPane.showInputDialog("Input what you would like to decode");
		encodedText = encodedText.toLowerCase();
		
	}

	public void decrypt() {
		String decodedText = "";
		for (int i = 0; i < encodedText.length(); i++) {
			if (!alpha.contains(String.valueOf(encodedText.charAt(i)))) {
				decodedText += " ";
				
			} else {
				decodedText += alpha.charAt((alpha.indexOf(encodedText.charAt(i)) + (alpha.length() - key)) % alpha.length());
				
			}

		}
		JOptionPane.showMessageDialog(null, decodedText);
		
	}
	
}
