package labb5;

/**
 * Equals button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
class EqualsButton extends CalculatorButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public EqualsButton(String text, Situation situation) {
		super(text, situation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transition() {
		switch (getSituation().state) {
		case Input1:
			break;
		case OpReady:
			break;
		case Input2:
			switch (getSituation().binaryOperator.getText()) {
			case "+":
				getSituation().display.setText(
						Integer.toString(getSituation().leftOperand + Integer.parseInt(getSituation().display.getText())));
			}
			getSituation().state = State.HasResult;
			break;
		case HasResult:
			break;
		}
	}

}
