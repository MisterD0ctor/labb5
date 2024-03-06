package labb5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

abstract class CalculatorButton extends JButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int SIZE = 60;
	private Situation situation;
	
	public CalculatorButton(String text, Situation situation) {
		super(text);
		this.setPreferredSize(new Dimension(SIZE, SIZE));
		this.setBackground(Color.GRAY);
		this.setFont(new Font("Arial", Font.PLAIN, 14));
		this.situation = situation;
	}
	
	public abstract void transition();
}
