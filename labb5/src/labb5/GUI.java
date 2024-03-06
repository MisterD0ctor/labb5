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
	private Container myPane;
	private JLabel display;
	private JPanel keypad;
	private JButton[] button = new JButton[16];

	public GUI() {

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints layoutConstraints = new GridBagConstraints();
		

		this.canvas = new JPanel();
		this.canvas.setLayout(layout);
		layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
		this.display = new JLabel("thing", SwingConstants.RIGHT);
		this.keypad = new JPanel();
		display.setBorder(BorderFactory.createLineBorder(Color.blue));
		//display.setOpaque(true);
		display.setPreferredSize(new Dimension(200, 50));
		keypad.setPreferredSize(new Dimension(200, 140));
		keypad.setBounds(200, 140, 200, 140);
		layoutConstraints.gridheight = 2;
		layoutConstraints.gridwidth = 1;
		canvas.add(display, layoutConstraints);
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = GridBagConstraints.REMAINDER;
		layoutConstraints.fill = GridBagConstraints.BOTH;
		layoutConstraints.weighty = 0.9;
		canvas.add(keypad, layoutConstraints);
		canvas.setSize(140, 140);
		//display.setAlignmentY(TOP_ALIGNMENT);
		//display.setAlignmentX(CENTER_ALIGNMENT);
		this.setSize(400, 400);
		// canvas.setLayout(layout);
		GridLayout gridLayout = new GridLayout(4, 4, 3, 3);	
		
		
		keypad.setLayout(gridLayout);
		//keypad.setAlignmentY(BOTTOM_ALIGNMENT);
		layout.columnWidths = new int[] {50,50};
		layout.rowHeights = new int[] {50, 50};

		// Skappande av alla knappar
		int index = 0;

		// i = index från botten uppåt
		for (int i = 2; i > -2; i--) {

			// Initieras utanför Loopen för att den ska användas i special knapparna.
			int k = 1;
			// k = index från vänster till höger
			for (k = 1; k < 4; k++) {
				if (i != -1) {
					this.button[index] = new JButton(Integer.toString(k + i * 3));
					//gridLayout.addLayoutComponent("thing", button[index]);
					keypad.add(button[index]);
				} else {
					this.button[index] = new JButton(Integer.toString(0));
					keypad.add(button[index]);
					index++;
					this.button[index] = new JButton("=");
					keypad.add(button[index]);
					index++;
					this.button[index] = new JButton("C");
					keypad.add(button[index]);
					index++;
					this.button[index] = new JButton("+");
					keypad.add(button[index]);
					return;
				}

				index++;

			}

			// after three buttons are declared in each collum the forth, which is always
			// special, is declared here.
			switch (i) {
				case 2: {
					// devition
					this.button[index] = new JButton("/");
					keypad.add(button[index]);
	
					System.out.print(i);
					break;
				}
				case 1: {
					// multiplication
					this.button[index] = new JButton("*");
					keypad.add(button[index]);
	
					System.out.print(i);
					break;
				}
				case 0: {
					// minus
					this.button[index] = new JButton("-");
					keypad.add(button[index]);
	
					// System.out.print(i);
					break;
				}

			}
			index++;

		}

		setVisible(true);
		pack();
	}

	// myPane.setLayout(new GridBagLayout());

	public static void main(String args[]) {

		GUI frame = new GUI();
		
		Container myPane = frame.getContentPane();
		//myPane.setLayout(new GridBagLayout());

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		frame.canvas.setOpaque(true);

		frame.display.setVisible(true);

		myPane.add(frame.display); // Adds Button to content pane of frame
		frame.setVisible(true);
		myPane.setVisible(true);

		myPane.add(frame.keypad);
		frame.keypad.setVisible(true);

	}
}
