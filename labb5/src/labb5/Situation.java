package labb5;

import javax.swing.JLabel;

/**
 * The situation of a calculator
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class Situation {
	State state = State.Input1;
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;
	
	/**
	 * Creates a situation with a display
	 * @param display an instance of JLabel
	 */
	public Situation(JLabel display) {
		this.display = display;
	}
}
