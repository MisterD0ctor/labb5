package labb5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * Calculator GUI
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel canvas;
	private JLabel display;
	private JPanel keypad;
	private Situation situation;	

	/**
	 * 
	 */
	public GUI() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints layoutConstraints = new GridBagConstraints();

		this.canvas = new JPanel();
		this.display = new JLabel("0", SwingConstants.RIGHT);
		this.keypad = new JPanel();
		this.canvas.setLayout(layout);
		display.setVerticalAlignment(JLabel.CENTER);
		display.setOpaque(true);
		display.setPreferredSize(new Dimension(200, 30));
		display.setBorder(BorderFactory.createLineBorder(Color.gray, 2, true));
		display.setFont(new Font("Consolas", Font.PLAIN, 27));
		
		//Sets the size of the keypad to four time each button size
		keypad.setPreferredSize(new Dimension(CalculatorButton.SIZE * 4, CalculatorButton.SIZE * 4));
		
		//Canvas gridbaglayout that contains two cells containing the display and keypad.
		
		//Adapts for given size of window.
		layoutConstraints.fill = GridBagConstraints.BOTH;
		layoutConstraints.weighty = 0.3;
		layoutConstraints.weightx = 0.3;
		
		//Grid:
		
		// (Canvas) 
		// ________
		//|Display |  
		//|________|  - Cell (0.0)
		// ________
		//| Keypad |  - Cell (0.1)
		//|[][][][]|
		//|[][][][]|
		//|[][][][]|
		//|[][][][]|
		//|________|
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		canvas.add(display, layoutConstraints);
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 2;
		
		canvas.add(keypad, layoutConstraints);
		GridLayout gridLayout = new GridLayout(4, 4, 0, 0);
		keypad.setLayout(gridLayout);
		
		this.situation = new Situation(display);
		this.setContentPane(canvas); 
		
		
		
		this.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint());
		//this.setLocation(500, 400);

		// Skappande av alla knappar
		
		//Digits 7 through 9:
		for (int i = 9; i >= 7; i--) {
			keypad.add(new DigitButton(Integer.toString(i), situation));
		}
		keypad.add(new BinOpButton("/", situation));		
		//Digits 4 through 6:
		for (int i = 6; i >= 4; i--) {
			keypad.add(new DigitButton(Integer.toString(i), situation));
		}
		keypad.add(new BinOpButton("*", situation));		
		//Digits 1 through 3:
		for (int i = 3; i >= 1; i--) {
			keypad.add(new DigitButton(Integer.toString(i), situation));
		}
		keypad.add(new BinOpButton("-", situation));
		keypad.add(new DigitButton("0", situation));
		keypad.add(new EqualsButton("=", situation));
		keypad.add(new CancelButton("C", situation));
		keypad.add(new BinOpButton("+", situation));
		
		
		setVisible(true);
		pack();
	}
}
