package labb5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		this.addActionListener(new ButtonListener(this));
		this.situation = situation;
	}
	
	protected Situation getSituation() {
		return situation;
	}
	
	public abstract void transition();
}

class ButtonListener implements ActionListener {

	private CalculatorButton button;
	
	public ButtonListener(CalculatorButton button) {
		this.button = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		button.transition();
	}
	
}
