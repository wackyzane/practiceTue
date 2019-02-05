import javax.swing.JOptionPane;

public class Runner {
	
	/*
	 * Circle: input r, calculate circumference, area *
	 * Rectangle: input side A, B, calculate perimeter, area, and diagonal *
	 * Triangle: Input sides A, B, C calculate perimeter, area, all angles *
	 * Cuboid: Input sides A, B, C calculate volume, total surface area *
	 * Sphere: Input radius, calculate volume, and surface area *
	 * 
	 * pi * r^2 Math.pi*Math.pow(r, 2);
	 */
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Hello, Welcome to my! Geometry program!");
		
		// Instantiate each class
		
		Triangle myTriangle = new Triangle();
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		
		int goAgain = 1;
		
		while (goAgain == 1) {
			String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
			String answer = JOptionPane.showInputDialog(msg);
	
			JOptionPane.showMessageDialog(null, answer);
			
			// When comparing strings, == is unreliable - do not use ==
			// Instead, use String class methods .equals
			if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {
				JOptionPane.showMessageDialog(null, "We are Triangle");
				myTriangle.setVarsToZero();
				myTriangle.setSides();
				myTriangle.calcPerimeter();
				myTriangle.calcArea();
				myTriangle.calcAngles();
				// myTriangle.showVars();
				
			} else if ((answer.equals("Rectangle")) || (answer.equals("rectangle"))) {
				JOptionPane.showMessageDialog(null, "We are Rectangle");
				myRectangle.setVarsToZero();
				myRectangle.setSides();
				myRectangle.calcperimeter();
				myRectangle.calcArea();
				myRectangle.calcDiag();
				
			} else if ((answer.equals("Circle")) || (answer.equals("circle"))) {
				JOptionPane.showMessageDialog(null, "We are Circle");
				myCircle.setVarsToZero();
				myCircle.setRadius();
				myCircle.calcCircum();
				myCircle.calcArea();
				
			} else if ((answer.equals("Cuboid")) || (answer.equals("cuboid"))) {
				JOptionPane.showMessageDialog(null, "We are Cuboid");
				myCuboid.setVarsToZero();
				myCuboid.setSides();
				myCuboid.calcVol();
				myCuboid.calcSurArea();
				
			} else if ((answer.equals("Sphere")) || (answer.equals("sphere"))) {
				JOptionPane.showMessageDialog(null, "We are Sphere");
				mySphere.setVarsToZero();
				mySphere.setRadius();
				mySphere.calcVol();
				mySphere.calcSurArea();
				
			} else {
				JOptionPane.showMessageDialog(null, "ERROR ERROR ERROR");
				
			}
			msg = "Would you like to go again? (Y/N)";
			answer = JOptionPane.showInputDialog(msg);
			
			JOptionPane.showMessageDialog(null, answer);
			
			if ((answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes"))) {
				goAgain = 1;
			} else {
				goAgain = 0;
				JOptionPane.showMessageDialog(null, "Ok...");
			}
			
		}
		
	}
	
}
