package mousedraw;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class MouseDraw extends JFrame {
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenu boardColor = new JMenu("BoardColor");
	JMenu penSize = new JMenu("PenSize");
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem exitMenuItem = new JMenuItem("Exit");
	JMenuItem whiteMenuItem = new JMenuItem("White");
	JMenuItem blackMenuItem = new JMenuItem("Black");
	JMenuItem blueMenuItem = new JMenuItem("Blue");
	JMenuItem redMenuItem = new JMenuItem("Red");
	JMenuItem fineMenuItem = new JMenuItem("Fine");
	JMenuItem smallMenuItem = new JMenuItem("Small");
	JMenuItem mediumMenuItem = new JMenuItem("Medium");
	JMenuItem largeMenuItem = new JMenuItem("Large");
	
	JPanel drawPanel = new JPanel();
	
	JLabel leftColorLabel = new JLabel();
	JLabel rightColorLabel = new JLabel();
	
	JPanel colorPanel = new JPanel();
	JLabel[] colorLabel = new JLabel[14];
	Color drawColor, leftColor, rightColor;
	
	double xPrevious, yPrevious;
	
	Graphics2D g2D;
	
	public MouseDraw() {
		// JFrame Constructor
		
		setTitle("Artistic Creations by Perry K! October 2018");
		setResizable(false);
		setSize(800, 600);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitForm(e);
				
			}
			
		});
		
		getContentPane().setLayout(new GridBagLayout());
		
		setJMenuBar(mainMenuBar);
		mainMenuBar.add(fileMenu);
		mainMenuBar.add(boardColor);
		mainMenuBar.add(penSize);
		
		fileMenu.setMnemonic('F');
		fileMenu.add(newMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		
		boardColor.setMnemonic('C');
		boardColor.add(whiteMenuItem);
		boardColor.addSeparator();
		boardColor.add(blackMenuItem);
		boardColor.addSeparator();
		boardColor.add(blueMenuItem);
		boardColor.addSeparator();
		boardColor.add(redMenuItem);
		
		penSize.setMnemonic('P');
		penSize.add(fineMenuItem);
		penSize.addSeparator();
		penSize.add(smallMenuItem);
		penSize.addSeparator();
		penSize.add(mediumMenuItem);
		penSize.addSeparator();
		penSize.add(largeMenuItem);
		
		newMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newMenuItemActionPerformed(e);
				
			}
			
		});
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitMenuItemActionPerformed(e);
				
			}
			
		});
		whiteMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				whiteMenuItemActionPerformed(e);
				
			}
			
		});
		blackMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blackMenuItemActionPerformed(e);
				
			}
			
		});
		blueMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				blueMenuItemActionPerformed(e);
				
			}
			
		});
		redMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redMenuItemActionPerformed(e);
				
			}
			
		});
		fineMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fineMenuItemActionPerformed(e);
				
			}
			
		});
		smallMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smallMenuItemActionPerformed(e);
				
			}
			
		});
		mediumMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mediumMenuItemActionPerformed(e);
				
			}
			
		});
		largeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				largeMenuItemActionPerformed(e);
				
			}
			
		});
		
		// Wed 10 OCT CHS only
		drawPanel.setPreferredSize(new Dimension(500,400));
		drawPanel.setBackground(Color.WHITE);
		
		GridBagConstraints gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		gridConstraints.gridheight = 2;
		gridConstraints.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(drawPanel, gridConstraints);
		
		drawPanel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				drawPanelMousePressed(e);
				
			}
			
		});
		
		drawPanel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				drawPanelMouseDragged(e);
				
			}
			
		});
		
		drawPanel.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				drawPanelMouseReleased(e);
				
			}
			
		});
		
		leftColorLabel.setPreferredSize(new Dimension(40, 40));
		leftColorLabel.setOpaque(true);
		leftColorLabel.setBackground(Color.BLUE);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(leftColorLabel, gridConstraints);
		
		rightColorLabel.setPreferredSize(new Dimension(40, 40));
		rightColorLabel.setOpaque(true);
		rightColorLabel.setBackground(Color.RED);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 5, 10, 10);
		getContentPane().add(rightColorLabel, gridConstraints);
		
		colorPanel.setPreferredSize(new Dimension(80, 250));
		colorPanel.setBorder(BorderFactory.createTitledBorder("Color"));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		gridConstraints.gridwidth = 2;
		gridConstraints.anchor = GridBagConstraints.NORTH;
		gridConstraints.insets = new Insets(10, 10, 10, 10);
		getContentPane().add(colorPanel, gridConstraints);
		
		colorPanel.setLayout(new GridBagLayout());
		int j = 0;
		for (int i = 0; i < 14; i++) {
			colorLabel[i] = new JLabel();
			colorLabel[i].setPreferredSize(new Dimension(30, 30));
			colorLabel[i].setOpaque(true);
			gridConstraints = new GridBagConstraints();
			gridConstraints.gridx = j;
			gridConstraints.gridy = i - j * 7;
			colorPanel.add(colorLabel[i], gridConstraints);
			if (i == 6) {
				j++;
				
			} // Add a listener for each and every color cell
			
			colorLabel[i].addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					colorMousePressed(e);
					
				}
				
			});
			
		} // Temp close add Listener
			// Make Shades of Colors
			colorLabel[0].setBackground(new Color(0, 0, 0)); // Black
			colorLabel[1].setBackground(new Color(0, 216, 255)); // Light Blue
			colorLabel[2].setBackground(new Color(0, 102, 255)); // Aqua
			colorLabel[3].setBackground(new Color(0, 0, 255)); // Blue
			colorLabel[4].setBackground(new Color(233, 0, 255)); // Purple
			colorLabel[5].setBackground(new Color(255, 0, 157)); // Pink
			colorLabel[6].setBackground(new Color(244, 66, 66)); // Red
			colorLabel[7].setBackground(new Color(255, 107, 0)); // Yellow
			colorLabel[8].setBackground(new Color(255, 204, 0)); // Gold
			colorLabel[9].setBackground(new Color(255,255,0)); // Yellow
			colorLabel[10].setBackground(new Color(165, 255, 0)); // Grass Green
			colorLabel[11].setBackground(new Color(93, 255, 0)); // Neon
			colorLabel[12].setBackground(new Color(0, 255, 169)); // Grass Green
			colorLabel[13].setBackground(new Color(255,255,255)); // White
			
			leftColor = colorLabel[0].getBackground();
			leftColorLabel.setBackground(leftColor);
			rightColor = colorLabel[13].getBackground();
			rightColorLabel.setBackground(rightColor);
		
		pack();
		setLocationRelativeTo(null);
		// Create Graphics Object
		g2D = (Graphics2D) drawPanel.getGraphics();
		
	} // End of Constructor
	
	private void exitForm(WindowEvent e) {
		g2D.dispose();
		System.exit(0);
		
	}
	
	private void exitMenuItemActionPerformed(ActionEvent e) {
		int response;
		response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit Program", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if (response == JOptionPane.NO_OPTION) {
			return;
			
		} else {
			exitForm(null);
			
		}
		
	}
	private void newMenuItemActionPerformed(ActionEvent e) {
		
		int response;
		response = JOptionPane.showConfirmDialog(null, "Are you sure you want to start a new drawing?", "New Drawing", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.YES_OPTION) {
			g2D.setPaint(drawPanel.getBackground());
			g2D.fill(new Rectangle2D.Double(0, 0, drawPanel.getWidth(), drawPanel.getHeight()));
			
		}
		
	}
	private void whiteMenuItemActionPerformed(ActionEvent e) {
		drawPanel.setBackground(Color.WHITE);
		
	}
	private void blackMenuItemActionPerformed(ActionEvent e) {
		drawPanel.setBackground(Color.BLACK);
		
	}
	private void blueMenuItemActionPerformed(ActionEvent e) {
		drawPanel.setBackground(Color.BLUE);
		
	}
	private void redMenuItemActionPerformed(ActionEvent e) {
		drawPanel.setBackground(Color.RED);
		
	}
	private void fineMenuItemActionPerformed(ActionEvent e) {
		g2D.setStroke(new BasicStroke(1));
		
	}
	private void smallMenuItemActionPerformed(ActionEvent e) {
		g2D.setStroke(new BasicStroke(5));
		
	}
	private void mediumMenuItemActionPerformed(ActionEvent e) {
		g2D.setStroke(new BasicStroke(10));
		
	}
	private void largeMenuItemActionPerformed(ActionEvent e) {
		g2D.setStroke(new BasicStroke(20));		
		
	}
	
	private void drawPanelMousePressed(MouseEvent e) {	
		if(e.getButton() == MouseEvent.BUTTON1 || e.getButton() == MouseEvent.BUTTON3) {
			xPrevious = e.getX();
			yPrevious = e.getY();
			if (e.getButton() == MouseEvent.BUTTON1) {
				drawColor = leftColor;
				
			} else {
				drawColor = rightColor;
				
			}
			
		}
		// System.out.println("mouse x, y = " + xPrevious + ", " + yPrevious);
	} // End of drawPanelMousePressed
	
	private void drawPanelMouseDragged(MouseEvent e) {	
		Line2D.Double myLine = new Line2D.Double(xPrevious, yPrevious, e.getX(), e.getY());
		g2D.setPaint(drawColor);
		g2D.draw(myLine);
		xPrevious = e.getX();
		yPrevious = e.getY();
		
	} // End of drawPanelMouseDragged
	
	private void drawPanelMouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1 || e.getButton() == MouseEvent.BUTTON3) {
			Line2D.Double myLine = new Line2D.Double(xPrevious, yPrevious, e.getX(), e.getY());
			g2D.setPaint(drawColor);
			g2D.draw(myLine);
			
		}
		
	} // End of drawPanelMouseReleased
	
	private void colorMousePressed(MouseEvent e) {
		Component clickedColor = e.getComponent();
		Toolkit.getDefaultToolkit().beep();
		if(e.getButton() ==  MouseEvent.BUTTON1) {
			leftColor = clickedColor.getBackground();
			leftColorLabel.setBackground(leftColor);
			
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			rightColor = clickedColor.getBackground();
			rightColorLabel.setBackground(rightColor);
			
		}
		
	} // End of colorMouse Pressed
	
} // End of class MouseDraw
