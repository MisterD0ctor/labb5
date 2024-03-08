package labb5;

import javax.swing.JLabel;

/**
 * The situation of a calculator
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
class Situation {
	State state = State.Input1;
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;
	
	/**
	 * 
	 * @param display an instance of JLabel
	 */
	Situation(JLabel display) {
		this.display = display;
	}
}
