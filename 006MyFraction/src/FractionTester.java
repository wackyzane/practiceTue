import javax.swing.JOptionPane;

public class FractionTester {
	private int fractionEnter;

	public static void main(String[] args) {
		// Text prompt asking for your numbers
		String msg = "Would you like to Add, Subtract, Multiply, or Divide the Fraction";
		String option = JOptionPane.showInputDialog(msg);
		msg = "Enter your first fraction:";
		String ffac = JOptionPane.showInputDialog(msg);
		msg = "Enter your second fraction:";
		String sfac = JOptionPane.showInputDialog(msg);
		
		Fraction myFraction = new Fraction(ffac, sfac, option);
		
		// Getting rid of extra fraction or whole number if not needed
		if (myFraction.getNumerator() == 0) {
			JOptionPane.showMessageDialog(null, myFraction.getSecInt());
			
		} else if (myFraction.getSecInt() == 0) {
			JOptionPane.showMessageDialog(null, myFraction.getNumerator() + "/" + myFraction.getDenominator());
			
		} else {
			JOptionPane.showMessageDialog(null, myFraction.getSecInt() + " " + myFraction.getNumerator() + "/" + myFraction.getDenominator());
			
		}
	
	}

}
