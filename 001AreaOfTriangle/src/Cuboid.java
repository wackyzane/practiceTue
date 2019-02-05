import javax.swing.JOptionPane;

public class Cuboid {
	// Variable go here
	private double length = 0.0;
	private double width = 0.0;
	private double height = 0.0;
	private double vol = 0.0;
	private double surArea = 0.0;
	
	// Methods go here
	public void setVarsToZero() {
		length = 0.0;
		width = 0.0;
		height = 0.0;
		vol = 0.0;
		surArea = 0.0;
		
	}
	
	public void setSides() {
		length = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for the Length: "));
		
		width = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for the Width: "));
		
		height = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for the Height: "));
		
	}
	
	public void calcVol() {
		vol = length * width * height;
		JOptionPane.showMessageDialog(null, "The Volume of the Cuboid is " + vol);
		
	}
	
	public void calcSurArea() {
		surArea = 2 * ((length*width) + (width * height) + (height * length));
		JOptionPane.showMessageDialog(null, "The Surface Area of the Cuboid is " + surArea);
		
	}
	
}
