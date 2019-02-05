package findTreasure;

// Imports
// Swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
// Awt
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
// Util
import java.util.Random;

public class FindTreasure extends JFrame {
	// Field
	int x = 5;
	int y = 5;
	int counter = 0;
	JLabel[][] choiceLabel = new JLabel[x][y];
	ImageIcon banana = new ImageIcon("banana.jpeg");
	ImageIcon bomb = new ImageIcon("bomb.png");
	JButton newButton = new JButton();
	JLabel showCounter = new JLabel();
	int bananaLocation0;
	int bananaLocation1;
	int bombLocation0;
	int bombLocation1;
	boolean stopClicks = false;
	Random myRandom = new Random();
	
	// Constructor
	public FindTreasure() {
		// Makes JFrame
		setSize(800, 600); // Temp for dev, might replace with pack()
		setTitle("Find the Banana - By Perry K.");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				exitForm(evt);
				
			}
			
		});
		
		// Required: set a layout manager, or use null
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints;
		
		for (int i = 0; i < x; i++) {
			for(int t = 0;t < y; t++) {
				choiceLabel[i][t] = new JLabel();
				gridConstraints = new GridBagConstraints();
				choiceLabel[i][t].setPreferredSize(new Dimension(banana.getIconWidth(), banana.getIconHeight()));
				choiceLabel[i][t].setOpaque(true);
				choiceLabel[i][t].setBackground(Color.RED);
				gridConstraints.gridx = i;
				gridConstraints.gridy = t;
				gridConstraints.insets = new Insets(10, 10, 10, 10);
				getContentPane().add(choiceLabel[i][t], gridConstraints);
				
					
				
				choiceLabel[i][t].addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						labelMouseClicked(e);
						GridBagConstraints gridConstraints;
						showCounter.setText("Counter: " + counter);
					    gridConstraints = new GridBagConstraints();
					    gridConstraints.gridx = 1;
					    gridConstraints.gridy = 6;
					    gridConstraints.insets = new Insets(10, 10, 10, 10);
					    getContentPane().add(showCounter, gridConstraints);
						
					}
					
				});
				
			}
			
			
		}
		
		newButton.setText("Play Again");
	    gridConstraints = new GridBagConstraints();
	    gridConstraints.gridx = 2;
	    gridConstraints.gridy = 6;
	    gridConstraints.insets = new Insets(10, 10, 10, 10);
	    getContentPane().add(newButton, gridConstraints);
	    newButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		newButtonActionPerformed(e);
	    		
	    	}
	    	
	    });
	    getContentPane().setBackground(Color.YELLOW);
	    pack();
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())), getWidth(), getHeight());
	    // start first game
	    newButton.doClick();
		
	} // End of Constructor
	
	// Methods
	private void exitForm(WindowEvent evt) {
		System.exit(0);
		
	}
	
	private void newButtonActionPerformed(ActionEvent e) {
	    // clear boxes and hide banana
		for (int i = 0; i < x; i++) {
			for	(int t = 0; t < y; t++) {
				choiceLabel[i][t].setIcon(null);
				choiceLabel[i][t].setBackground(Color.RED);
			}	
			
		}
		bombLocation0 = myRandom.nextInt(x);
		bombLocation0 = myRandom.nextInt(y);
		bananaLocation0 = myRandom.nextInt(x);
		bananaLocation1 = myRandom.nextInt(y);
		while (bananaLocation1 == bombLocation0) {
			bombLocation0 = myRandom.nextInt(x);
			bombLocation0 = myRandom.nextInt(y);
			
		}
		newButton.setEnabled(false);
		stopClicks = false;
		
	}
	
	private void labelMouseClicked(MouseEvent e) {
		Component clickedComponent = e.getComponent();
		int choice0 = 0;
		int choice1 = 0;
		if (stopClicks == false) {
			counter += 1;
			for (choice0 = 0; choice0 < x; choice0++) {
				for (choice1 = 0; choice1 < y; choice1++) {
					if (clickedComponent == choiceLabel[choice0][choice1]) {
						choiceLabel[choice0][choice1].setBackground(Color.WHITE);
						if (choice0 == bombLocation0) {
							if (choice1 == bombLocation1) {
								choiceLabel[choice0][choice1].setIcon(bomb);
								newButton.setEnabled(true);
								stopClicks = true;
								
							}
							
						}
						if (choice0 == bananaLocation0) {
							if (choice1 == bananaLocation1) {
								choiceLabel[choice0][choice1].setIcon(banana);
								newButton.setEnabled(true);
								stopClicks = true;
								counter = 0;
								
							}	
				
						}
						break;
						
					}
					
				}
			
			}
			
		}
		
		
	}
} // End of class FindTreasure
