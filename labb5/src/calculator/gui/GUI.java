package calculator.gui;

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

import calculator.buttons.BinOpButton;
import calculator.buttons.CalculatorButton;
import calculator.buttons.CancelButton;
import calculator.buttons.DigitButton;
import calculator.buttons.EqualsButton;
import calculator.state.Situation;

/**
 * Calculator GUI
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int DISPLAY_FONT_SIZE = 20;
	private static final int DISPLAY_BORDER_WIDTH = 3;
	private static final int HORIZONTAL_BUTTON_COUNT = 4;
	private static final int VERTICAL_BUTTON_COUNT = 4;
	/**
	 * 
	 */
	private JPanel canvas;
	/**
	 * 
	 */
	private JLabel display;
	/**
	 * 
	 */
	private JPanel keypad;
	/**
	 * 
	 */
	private Situation situation;

	/**
	 * Creates a new calculator GUI
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
		display.setBorder(BorderFactory.createLineBorder(Color.gray, DISPLAY_BORDER_WIDTH));
		display.setFont(new Font("Arial", Font.PLAIN, DISPLAY_FONT_SIZE));
		
		//Sets the size of the keypad to four time each button size
		keypad.setPreferredSize(new Dimension(CalculatorButton.SIZE * HORIZONTAL_BUTTON_COUNT,
				CalculatorButton.SIZE * VERTICAL_BUTTON_COUNT));
		
		//Canvas gridbaglayout that contains two cells containing the display and keypad.
		
		//Adapts for given size of window.
		layoutConstraints.fill = GridBagConstraints.BOTH;
		layoutConstraints.weighty = 1;
		layoutConstraints.weightx = 1;
		
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
		
		canvas.add(keypad, layoutConstraints);
		GridLayout gridLayout = new GridLayout(HORIZONTAL_BUTTON_COUNT, VERTICAL_BUTTON_COUNT, 0, 0);
		keypad.setLayout(gridLayout);
		
		this.situation = new Situation(display);
		this.setContentPane(canvas); 
		
		this.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint());

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
