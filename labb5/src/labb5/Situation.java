package labb5;

import javax.swing.JLabel;

class Situation {
	State state = State.Input1; // initial
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;
	
	Situation(JLabel display) {
		this.display = display;
	}
}
