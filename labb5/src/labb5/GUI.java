package labb5;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.Console;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class GUI extends JFrame {
	private JPanel canvas;
	private JLabel display;
	private JPanel keypad;
	private CalculatorButton[] button = new CalculatorButton[16];
	private Situation situation;	

	public GUI() {

		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints layoutConstraints = new GridBagConstraints();

		this.canvas = new JPanel();
		this.canvas.setLayout(layout);
		this.display = new JLabel("0", SwingConstants.RIGHT);
		this.keypad = new JPanel();
		
		display.setOpaque(true);
		display.setPreferredSize(new Dimension(200, 30));
		//keypad.setPreferredSize(new Dimension(260, 260));
		display.setBorder(BorderFactory.createLineBorder(Color.blue));
		keypad.setBounds(0, 60, 200, 140);
		//layoutConstraints.anchor = layoutConstraints.NORTH;
		//layoutConstraints.gridheight = 2;
		//layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		canvas.add(display, layoutConstraints);
		layoutConstraints.anchor = layoutConstraints.SOUTH;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 2;
		layoutConstraints.fill = GridBagConstraints.NORTH;
		layoutConstraints.weighty = 0.9;
		canvas.add(keypad, layoutConstraints);
		this.setSize(210, 330);
		// canvas.setLayout(layout);
		GridLayout gridLayout = new GridLayout(4, 4, 0, 0);
		
		this.situation = new Situation(display);
		this.setContentPane(canvas); 
		keypad.setLayout(gridLayout);
		//keypad.setAlignmentY(BOTTOM_ALIGNMENT);

		// Skappande av alla knappar

		for (int i = 9; i >= 7; i--) {
			keypad.add(new DigitButton(Integer.toString(i), situation));
		}
		keypad.add(new BinOpButton("/", situation));		
		for (int i = 6; i >= 4; i--) {
			keypad.add(new DigitButton(Integer.toString(i), situation));
		}
		keypad.add(new BinOpButton("*", situation));		
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
