package labb5;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.DisplayMode;
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
	private JButton[] button = new JButton[16]; 
	private Color backColour;
	private Graphics g;
	
	
	public GUI () {

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints layoutConstraints = new GridBagConstraints();
		this.canvas = new JPanel();
		this.display = new JLabel("thing");
		this.keypad = new JPanel();
		canvas.setLayout(layout);
		canvas.add(display);
		canvas.add(keypad);
		keypad.setLayout(layout);
		for (int i = 0; i < 16; i++) {
			this.button[i] = new JButton(Integer.toString(i));
			keypad.add(button[i]);
		}
		
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
	       frame.setSize(1000, 600);
	       frame.setBackground(Color.black);
	       frame.canvas.setSize(300,300);
	       frame.canvas.setBackground(Color.red);
	       frame.canvas.setOpaque(true);
	       
	       
	       frame.display.setVisible(true);
	      
	       myPane.add(frame.display); // Adds Button to content pane of frame
	       frame.setVisible(true);
	       myPane.setVisible(true);
	      
	       frame.keypad.setVisible(true);
	       for (int i = 0; i < 16; i++) {
	    	   myPane.add(frame.button[i]);
	    	   frame.button[i].setVisible(true);
			}
	       


   }
}
