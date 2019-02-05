import javax.swing.JOptionPane;

public class Sphere {
	// Variable go here
	private double rad = 0.0;
	private double vol = 0.0;
	private double surArea = 0.0;
	
	// Methods go here
	public void setVarsToZero() {
		rad = 0.0;
		vol = 0.0;
		surArea = 0.0;
		
	}
	
	public void setRadius() {
		rad = Double.parseDouble(JOptionPane.showInputDialog("Please enter a value for the radius: "));
		
	}
	
	public void calcVol() {
		vol = (((rad * rad) * rad) * 3.14) * 1.33333333;
		JOptionPane.showMessageDialog(null, "The Volume of the Sphere is " + vol);
		
	}
	
	public void calcSurArea() {
		surArea = 4 * 3.14 * (rad*rad);
		JOptionPane.showMessageDialog(null, "The Surface area of the Sphere is " + surArea);
		
	}
}
