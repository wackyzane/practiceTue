import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Kennedy_Cuba_Crisis.txt");
			BufferedReader br = new BufferedReader(fr);
			int count = 0;
			int total = 0;
			int a = 0;
			String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9",".",":"};
			int[] alphaNum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			boolean another = true;
			String str, answer;
			String playAgain = "N";
			
			while ((str = br.readLine()) != null) {
				for (int i = 0; i < alpha.length; i++) {
					System.out.println(i);
					for (int j = 0; j < str.length(); j++) {
						System.out.println(j);
						if (str.toLowerCase().charAt(j) == alpha[i].charAt(0)) {
							alphaNum[i] += 1;
							
						}
						
					}
					System.out.println(alphaNum[i]);
					// System.out.println(count);
				
				}
				
			}
			for (int l = 0; l < alpha.length; l++) {
				System.out.println(alpha[l]+": "+alphaNum[l]);
			}
			System.out.println(alpha);
			System.out.println(alphaNum);
			
			
			/*
			
			while (another == true) {
				answer = JOptionPane.showInputDialog("What Character would you like you know how many of there are? (I will only take the first character)");
				char letter = answer.charAt(0);
				while ((str = br.readLine()) != null) {
					System.out.println(str);
					for (int i = 0; i < alpha.length(); i++) {
						for (int j = 0; j < str.length(); j++) {
							if (str.charAt(j) == alpha.charAt(i)) {
								count += 1;
								if (str.charAt(j) == letter) {
									total += count;
								}
							
							}
							
						}
						count = 0;
						
					}
				
				}
				br.close();
				JOptionPane.showMessageDialog(null, "Your total is " + total);
				while (playAgain != "Y") {
					playAgain = JOptionPane.showInputDialog("Do you want to play again? (y / n)");
					playAgain = String.valueOf(playAgain.charAt(0)).toUpperCase();
					if (playAgain.equals("Y")) {
						another = true;
						
					} else if (playAgain.equals("N")) {
						another = false;
						
					} else {
						JOptionPane.showMessageDialog(null, "That is not yes or no! Try again.");
						
					}
					
				}
				
			}
			*/
			
		} catch (IOException e) {
			System.out.println("IO error: " + e);
			
		}

	}

}
