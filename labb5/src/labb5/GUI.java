package labb5;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GUI extends JFrame{
	private JPanel canvas;
	private Container myPane;
	private JLabel display;
	private JPanel keypad;
	private JButton[] button; 
	private Color backColour;
	private Graphics g;
	
	
	public GUI () {

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints layoutConstraints = new GridBagConstraints();
		this.canvas = new JPanel();
		this.display = new JLabel();
		this.keypad = new JPanel();
		//g.setColor(Color.red);
		//this.g.drawRect(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		canvas.setLayout(layout);
		canvas.add(display);
		canvas.add(keypad);
		//for (int i = 0; i < 16; i++) {
			//this.button = new JButton[i];
			//keypad.add(button[i]);
		//}
		
		setVisible(true);
		pack();
	}

    //myPane.setLayout(new GridBagLayout());

	public static void main(String args[]){
		   
	       GUI frame = new GUI();
	       frame.display.setBorder(null);
	       Container myPane = frame.getContentPane();
	       myPane.setLayout(new GridBagLayout());
	       
	       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	       frame.setSize(400, 400);
	       frame.setBackground(Color.black);
	       frame.canvas.setSize(300,300);
	       frame.canvas.setBackground(Color.red);
	       
	       frame.display.setVisible(true);
	       //JButton button = new JButton("Press");
	       
	       //frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);


   }
}
