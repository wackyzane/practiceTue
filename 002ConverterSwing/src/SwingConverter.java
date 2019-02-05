import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class SwingConverter implements ActionListener {
	private JPanel inputPanel = initInputPanel();
	private JTextField inputTextBase;
	private JTextField inputTextSphere;
	private JTextArea resultArea;
	private JButton enterButtonBase;
	private JButton enterButtonSphere;
	private double vol = 0.0;
	private double surArea = 0.0;
	
	// Constructors
	public SwingConverter() {
		JFrame myWindow = new JFrame("Base Converter - Created by PerryK");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.add(inputPanel);
		myWindow.setSize(600, 500);
		myWindow.setVisible(true);
		
	}
	
	public SwingConverter(String name) {
		
	}
	// Constructors end
	
	// Methods
	private JPanel initInputPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new java.awt.Dimension(600, 500));
		panel.setBackground(new Color(98, 138, 212));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Enter a base-10 number: ");
		label.setBounds(50, 50, 220, 30);
		panel.add(label); // FIX!
		
		JTextField textBase; // Weird, but I'm am going to freak out ...
		textBase = inputTextBase = new JTextField();
		textBase.setBounds(230, 50, 100, 30);
		panel.add(textBase);
		
		JButton buttonBase = new JButton("Enter");
		buttonBase.setActionCommand("EnterBase");
		buttonBase.setBounds(340, 50, 80, 30);
		buttonBase.setBackground(java.awt.Color.GREEN);
		buttonBase.addActionListener(this);
		panel.add(buttonBase);
		// Save to the class variable, to be used in other methods
		enterButtonBase = buttonBase; // Assign it to a class variable to be used in other methods
		
		buttonBase = new JButton("Reset");
		buttonBase.setActionCommand("ResetBase");
		buttonBase.setBounds(430, 50, 80, 30);
		buttonBase.setBackground(java.awt.Color.RED);
		buttonBase.addActionListener(this);
		panel.add(buttonBase);
		
		resultArea = new JTextArea();
		resultArea.setBounds(50, 180, 500, 200);
		resultArea.setEditable(false);
		resultArea.setBackground(java.awt.Color.WHITE);
		panel.add(resultArea);
		// End of Enter base-10
		JLabel labelSphere = new JLabel("Enter radius for sphere: ");
		labelSphere.setBounds(50, 100, 220, 30);
		panel.add(labelSphere); // FIX!
		
		JTextField textSphere;
		textSphere = inputTextSphere = new JTextField();
		textSphere.setBounds(230, 100, 100, 30);
		panel.add(textSphere);
		
		JButton buttonSphere = new JButton("Reset");
		buttonSphere.setActionCommand("ResetSphere");
		buttonSphere.setBounds(430, 100, 80, 30);
		buttonSphere.setBackground(java.awt.Color.RED);
		buttonSphere.addActionListener(this);
		panel.add(buttonSphere);
		
		buttonSphere = new JButton("Enter");
		buttonSphere.setActionCommand("EnterSphere");
		buttonSphere.setBounds(340, 100, 80, 30);
		buttonSphere.setBackground(java.awt.Color.GREEN);
		buttonSphere.addActionListener(this);
		panel.add(buttonSphere);
		enterButtonSphere = buttonSphere;
		
		return panel;
		
	}
	
	private void showResultBase() {
		String hexUpperCase;
		inputTextBase.setEnabled(false);
		enterButtonBase.setEnabled(false);
		
		Integer n = getInputNumberBase();
		if (n == null) {
			resultArea.append("Invalid number!");
			return;
			
		}
		
		int baseTen = n.intValue();
		resultArea.append("Decimal(Base Ten(0-9)) = " + baseTen + "\n");
		resultArea.append("Binary = " + Integer.toString(baseTen, 2) + "\n");
		resultArea.append("Octal = " + Integer.toString(baseTen, 8) + "\n");
		resultArea.append("Hexadecimal = " + Integer.toString(baseTen, 16) + "\n");
		
		hexUpperCase = Integer.toString(baseTen, 16).toUpperCase();
		resultArea.append("Hexdecimal = " + hexUpperCase + "\n");
		
	}
	
	private void showResultSphere() {
		inputTextSphere.setEnabled(false);
		enterButtonSphere.setEnabled(false);
		
		Integer n = getInputNumberSphere();
		if (n == null) {
			resultArea.append("Invalid number!");
			return;
			
		}
		
		int rad = n.intValue();
		vol = 1.333333 * 3.14 * (rad*rad*rad);
		surArea = 4 * 3.14 * (rad*rad);
		resultArea.append("Radius = " + rad + "\n");
		resultArea.append("Diameter = " + rad*2 + "\n");
		resultArea.append("Volume = " + vol + "\n");
		resultArea.append("Surface Area = " + surArea + "\n");;
		
	}
	
	private void resetBase() {
		inputTextBase.setText("");
		resultArea.setText("");
		inputTextBase.setEnabled(true);
		enterButtonBase.setEnabled(true);
		inputTextBase.requestFocus();
		
	}
	
	private void resetSphere() {
		inputTextSphere.setText("");
		resultArea.setText("");
		inputTextSphere.setEnabled(true);
		enterButtonSphere.setEnabled(true);
		inputTextSphere.requestFocus();
		
	}
	
	private Integer getInputNumberBase() {
		try {
			Integer n = Integer.parseInt(inputTextBase.getText());
			return n;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	private Integer getInputNumberSphere() {
		try {
			Integer n = Integer.parseInt(inputTextSphere.getText());
			return n;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		// SwingConverter baseConverter = new SwingConverter();
		new SwingConverter();
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		String command = ev.getActionCommand();
		if (command.equals("EnterBase")) {
			showResultBase();

		} else if (command.equals("ResetBase")) {
			resetBase();
			
		} else if (command.equals("EnterSphere")) {
			showResultSphere();
			
		} else if (command.equals("ResetSphere")) {
			resetSphere();
			
		}
		
	}
	
}
