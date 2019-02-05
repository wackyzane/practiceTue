import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
		
	// Class vars aka instance variables aka field variables
	JFrame frame;
	JTextField textField;
	// Buttons 0 through 9, add, subtract, multiply, divide,
	// Equals, clear, backspace.
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub,
	bmul, bdiv, bclr, bksp, bsqr, bsqt, blog, beq, bpow;
	
	Random rand = new Random();
	Double firstNumber;
	Double secondNumber;
	Double result;
	int operator;
	
	// Constructor
	public Calculator() {
		frame = new JFrame("Calculator, Created by Perry K.");
		frame.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(40, 40, 420, 30);
		frame.add(textField);
		
		b1 = new JButton("1");
		b1.setBounds(40, 240, 50, 40);
		b1.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b1);
		b1.addActionListener(this);
		
		b4 = new JButton("4");
		b4.setBounds(40, 170, 50, 40);
		b4.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b4);
		b4.addActionListener(this);
		
		b7 = new JButton("7");
		b7.setBounds(40, 100, 50, 40);
		b7.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b7);
		b7.addActionListener(this);
		
		b0 = new JButton("0");
		b0.setBounds(40, 310, 120, 40);
		b0.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b0);
		b0.addActionListener(this);
		// End of First Column
		b2 = new JButton("2");
		b2.setBounds(110, 240, 50, 40);
		b2.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b2);
		b2.addActionListener(this);
		
		b5 = new JButton("5");
		b5.setBounds(110, 170, 50, 40);
		b5.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b5);
		b5.addActionListener(this);
		
		b8 = new JButton("8");
		b8.setBounds(110, 100, 50, 40);
		b8.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b8);
		b8.addActionListener(this);
		// End of Second Column
		b3 = new JButton("3");
		b3.setBounds(180, 240, 50, 40);
		b3.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b3);
		b3.addActionListener(this);
		
		b6 = new JButton("6");
		b6.setBounds(180, 170, 50, 40);
		b6.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b6);
		b6.addActionListener(this);
		
		b9 = new JButton("9");
		b9.setBounds(180, 100, 50, 40);
		b9.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(b9);
		b9.addActionListener(this);

		bdec = new JButton(".");
		bdec.setBounds(180, 310, 50, 40);
		bdec.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bdec);
		bdec.addActionListener(this);
		// End of Third Column
		bsub = new JButton("-");
		bsub.setBounds(250, 100, 50, 40);
		bsub.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bsub);
		bsub.addActionListener(this);
		
		bdiv = new JButton("/");
		bdiv.setBounds(250, 170, 50, 40);
		bdiv.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bdiv);
		bdiv.addActionListener(this);
		
		beq = new JButton("Enter");
		beq.setBounds(250, 310, 120, 40);
		beq.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(beq);
		beq.addActionListener(this);
		
		bclr = new JButton("Clear");
		bclr.setBounds(250, 240, 120, 40);
		bclr.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bclr);
		bclr.addActionListener(this);
		// End of Fourth Column
		badd = new JButton("+");
		badd.setBounds(320, 100, 50, 40);
		badd.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(badd);
		badd.addActionListener(this);
		
		bmul = new JButton("*");
		bmul.setBounds(320, 170, 50, 40);
		bmul.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bmul);
		bmul.addActionListener(this);
		// End of Fifth Column
		bsqt = new JButton("^2");
		bsqt.setBounds(390, 100, 70, 40);
		bsqt.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bsqt);
		bsqt.addActionListener(this);
		
		bsqr = new JButton("√");
		bsqr.setBounds(390, 170, 70, 40);
		bsqr.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bsqr);
		bsqr.addActionListener(this);
		
		blog = new JButton("Log");
		blog.setBounds(390, 240, 70, 40);
		blog.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(blog);
		blog.addActionListener(this);
		
		bpow = new JButton("^");
		bpow.setBounds(390, 310, 70, 40);
		bpow.setBackground(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		frame.add(bpow);
		bpow.addActionListener(this);
		// End of Sixth Column
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500, 400);
		frame.setVisible(true);
		
	}
	// Listener -- waiting for an event, mouse click, mouse over...
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
			textField.setText(textField.getText().concat("1"));
		if(e.getSource() == b2)
			textField.setText(textField.getText().concat("2"));
		if(e.getSource() == b3)
			textField.setText(textField.getText().concat("3"));
		if(e.getSource() == b4)
			textField.setText(textField.getText().concat("4"));
		if(e.getSource() == b5)
			textField.setText(textField.getText().concat("5"));
		if(e.getSource() == b6)
			textField.setText(textField.getText().concat("6"));
		if(e.getSource() == b7)
			textField.setText(textField.getText().concat("7"));
		if(e.getSource() == b8)
			textField.setText(textField.getText().concat("8"));
		if(e.getSource() == b9)
			textField.setText(textField.getText().concat("9"));
		if(e.getSource() == b0)
			textField.setText(textField.getText().concat("0"));
		if(e.getSource() == bdec)
			textField.setText(textField.getText().concat("."));
		if(e.getSource() == bclr) {
			textField.setText("");
			
		}
		if(e.getSource() == badd) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 1;
			textField.setText("");
			
		}
		if(e.getSource() == bsub) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 2;
			textField.setText("");
			
		}
		if(e.getSource() == bmul) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 3;
			textField.setText("");
			
		}
		if(e.getSource() == bdiv) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 4;
			textField.setText("");
			
		}
		if(e.getSource() == bsqt) {
			firstNumber = Double.parseDouble(textField.getText());
			result = Math.pow(firstNumber, 2);
			textField.setText("" + result);
			
		}
		if(e.getSource() == bsqr) {
			firstNumber = Double.parseDouble(textField.getText());
			result = Math.sqrt(firstNumber);
			textField.setText("" + result);
			
		}
		if(e.getSource() == blog) {
			firstNumber = Double.parseDouble(textField.getText());
			result = Math.log(firstNumber);
			textField.setText("" + result);
			
		}
		if(e.getSource() == bpow) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 5;
			textField.setText("");
			
		}
		if(e.getSource() == bksp) {
			//s is what was in the text field
			String s=textField.getText();
			//Clear text Field
			textField.setText("");
			// For every character in s minus one,
			for(int i=0;i<s.length()-1;i++)
				// Add that character from s into the text field.
				textField.setText(textField.getText()+s.charAt(i));
			
		}
		if(e.getSource() == beq) {
			secondNumber = Double.parseDouble(textField.getText());
			
			switch(operator) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				case 5:
					result = Math.pow(firstNumber, secondNumber);
					break;
				default: result = 0.0;
			
			}
			textField.setText("" + result);
			
		}
		
	}
	// Handler Methods
		
} // end of Calculator class
