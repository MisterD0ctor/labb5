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
	private DigitButton[] button = new DigitButton[100];
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
		display.setPreferredSize(new Dimension(140, 30));
		keypad.setPreferredSize(new Dimension(200, 260));
		display.setBorder(BorderFactory.createLineBorder(Color.blue));
		keypad.setBounds(0, 60, 200, 140);
		//layoutConstraints.anchor = layoutConstraints.NORTH;
		//layoutConstraints.gridheight = 2;
		//layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		canvas.add(display, layoutConstraints);
		//layoutConstraints.anchor = layoutConstraints.SOUTH;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 2;
		layoutConstraints.fill = GridBagConstraints.BOTH;
		layoutConstraints.weighty = 0.3;
		canvas.add(keypad, layoutConstraints);
		canvas.setSize(220, 300);
		this.setSize(220, 300);
		// canvas.setLayout(layout);
		GridLayout gridLayout = new GridLayout(4, 4, 3, 3);
		
		this.situation = new Situation(display);
		this.setContentPane(canvas); 
		keypad.setLayout(gridLayout);
		//keypad.setAlignmentY(BOTTOM_ALIGNMENT);

		
		
		
		
		// Skappande av alla knappar
		int index = 0;

		// i = index från botten uppåt
		for (int i = 2; i > -2; i--) {

			// Initieras utanför Loopen för att den ska användas i special knapparna.
			int k = 1;
			// k = index från vänster till höger
			for (k = 1; k < 4; k++) {
				if (i != -1) {
					this.button[index] = new DigitButton(Integer.toString(k + i * 3), situation);
					keypad.add(button[index]);
				} else {
//					this.button[index] = new DigitButton(Integer.toString(0), situation);
//					keypad.add(button[index]);
//					index++;
//					this.button[index] = new JButton("=")
//					keypad.add(button[index]);
//					index++;
//					this.button[index] = new JButton("C");
//					keypad.add(button[index]);
					index++;
					BinOpButton binOpButton = new BinOpButton("+", situation);
					keypad.add(binOpButton);
					return;
				}

				index++;

			}

			// after three buttons are declared in each collum the forth, which is always
			// special, is declared here.
//			switch (i) {
//				case 2: {
//					// devition
//					this.button[index] = new JButton("/");
//					keypad.add(button[index]);
//	
//					System.out.print(i);
//					break;
//				}
//				case 1: {
//					// multiplication
//					this.button[index] = new JButton("*");
//					keypad.add(button[index]);
//	
//					System.out.print(i);
//					break;
//				}
//				case 0: {
//					// minus
//					this.button[index] = new JButton("-");
//					keypad.add(button[index]);
//	
//					// System.out.print(i);
//					break;
//				}
//
//			}
			index++;

		}

		setVisible(true);
		pack();
	}
}
