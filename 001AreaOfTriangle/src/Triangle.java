// import java.util.Scanner;
import javax.swing.JOptionPane;

public class Triangle {

	// Class variable go here...
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	// Scanner keyboard = new Scanner(System.in);
	
	// Constructor goes here...
	public Triangle() {
				
	}
	
	// Methods go here...
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
		
	} // End of setVarsToZero
	
	//public void showVars() {
		//String msg = "Side A, B, C = " + sideA + ", " + sideB + ", " + sideC + "; perimeter: " + perimeter + "; area = " + theArea;
		//JOptionPane.showMessageDialog(null, msg);
		//System.out.println("Side A is: " + sideA);
		//System.out.println("Side B is: " + sideB);
		//System.out.println("Side C is: " + sideC);
		//System.out.println("Perimeter is: " + perimeter);
		//System.out.println("Area is: " + theArea);
		
	//} // End of ShowVars
	
	public void setSides() {
		//System.out.println("Enter a value for side A:   ");
		//sideA = keyboard.nextDouble();
		boolean b = true;
		while (b) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A: "));
				b = false;
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number");
				
			}
			
		}
		
		//System.out.println("Enter a value for side B:   ");
		//sideB = keyboard.nextDouble();
		b = true;
		while (b) {
			try {
				sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B: "));
				b = false;
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number");
				
			}
			
		}
		
		//System.out.println("Enter a value for side C:   ");
		//sideC = keyboard.nextDouble();
		b = true;
		while (b) {
			try {
				sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side C: "));
				b = false;
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number");
				
			}
			
		}
		
	} // End of setSides
	
	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		JOptionPane.showMessageDialog(null, "The Perimeter of the Triangle is " + perimeter);
		
	} // End of calcPerimeter
	
	public void calcArea() {
		double p = (sideA + sideB + sideC)/2.0;

		theArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		JOptionPane.showMessageDialog(null, "The Area of the Triangle is " + theArea);
		
	} // End of calcArea
	
	public void calcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0;
		// Angle A
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0)) / (2.0 * sideB * sideC);
		// System.out.println("cosA = " + cosA);
		Acos = Math.acos(cosA);
		Adeg = Math.toDegrees(Acos);
		JOptionPane.showMessageDialog(null, "cosA = " + cosA + "; arcCos = " + Acos + "; angle of A = " + Adeg);
		// System.out.println("Angle of A = " + Adeg);
		// System.out.println("");
		
		// Angle B
		cosA = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0)) / (2.0 * sideC * sideA);
		// System.out.println("cosB = " + cosA);
		Acos = Math.acos(cosA);
		// System.out.println("arcCos = " + Acos);
		Adeg = Math.toDegrees(Acos);
		JOptionPane.showMessageDialog(null, "; cosB = " + cosA + "; arcCos = " + Acos + "; angle of B = " + Adeg);
		// System.out.println("Angle of B = " + Adeg);
		// System.out.println("");
		
		// Angle C
		cosA = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0)) / (2.0 * sideA * sideB);
		// System.out.println("cosC = " + cosA);
		Acos = Math.acos(cosA);
		// System.out.println("arcCos = " + Acos);
		Adeg = Math.toDegrees(Acos);
		JOptionPane.showMessageDialog(null, "; cosC = " + cosA + "; arcCos = " + Acos + "; angle of C = " + Adeg);
		// System.out.println("Angle of C = " + Adeg);
		// System.out.println("");
		
	}
} // End of class
