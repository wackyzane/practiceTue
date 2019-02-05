// import java.util.Scanner;

import javax.swing.JOptionPane;

public class Circle {
	
	//Class Variables go here
	private double rad = 0.0;
	private double circum = 0.0;
	private double theArea = 0.0;
	//Scanner keyboard = new Scanner(System.in);
	
	//Methods go here
	public void setVarsToZero() {
		rad = 0.0;
		circum = 0.0;
		theArea = 0.0;
		
	}
	
	public void setRadius() {
		// System.out.println("Enter a value for the radius:   ");
		// r = keyboard.nextDouble();
		rad = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for the radius: "));
		
	}
	
	public void calcCircum() {
		circum = 2 * 3.14 * rad;
		// System.out.println("The circumference of a cirlce is: " + circum);
		JOptionPane.showMessageDialog(null, "The Cirumference of the circle is " + circum);
		
	}
	
	public void calcArea() {
		theArea = 3.14 * (rad * rad);
		// System.out.println("The Area of a circle is: " + theArea);
		JOptionPane.showMessageDialog(null, "The Area of the circle is " + theArea);
		
	}
	
}
