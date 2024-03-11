package labb5;

import java.awt.Color;

/**
 * Binary operator button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
public class BinOpButton extends CalculatorButton {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates an binary operator button with text and a situation
	 * @param text An instanece of String
	 * @param situation An instance of Situation
	 */
	public BinOpButton(String text, Situation situation) {
		super(text, situation);
	}

	@Override
	public void transition() {
		switch (getSituation().getState()) {
		case Input1:
			this.setColor(Color.RED);
			getSituation().setBinaryOperator(this);
			getSituation().setState(State.OpReady);
			break;
		case OpReady:
			if (getSituation().getBinaryOperator() != null) {
				getSituation().getBinaryOperator().setColor(Color.GRAY);
				this.setColor(Color.RED);
				getSituation().setBinaryOperator(this);
			}
			break;
		case Input2:
			// gör ingenting
			break;
		case HasResult:
			this.setColor(Color.RED);
			getSituation().setBinaryOperator(this);
			getSituation().setState(State.OpReady);
			break;
		}
	}
}
