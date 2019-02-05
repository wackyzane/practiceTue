import javax.swing.JOptionPane;

public class Rectangle {
	
	// Variable go here
	private double sideA = 0.0;
	private double sideB = 0.0;
	private double diag = 0.0;
	private double theArea = 0.0;
	private double perimeter = 0.0;
	
	// Methods go here
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		diag = 0.0;
		theArea = 0.0;
		perimeter = 0.0;
		
	}
	
	public void setSides() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for the side A: "));
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for the Side B: "));
		
	}
	
	public void calcperimeter() {
		perimeter = (sideA + sideB) * 2;
		JOptionPane.showMessageDialog(null, "The Perimeter of the Rectangle is " + perimeter);
		
	}
	
	public void calcArea() {
		theArea = sideB * sideA;
		JOptionPane.showMessageDialog(null, "The Area of the Rectangle is " + theArea);
		
	}
	
	public void calcDiag() {
		diag = Math.sqrt((sideA * sideA) + (sideB * sideB));
		JOptionPane.showMessageDialog(null, "The Diagonal of the Rectangle is " + diag);
		
	}
	
}
