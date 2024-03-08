package labb5;

/**
 * Digit button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
class DigitButton extends CalculatorButton {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public DigitButton(String text, Situation situation) {
		super(text, situation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transition() {
		switch (getSituation().state) {
		case Input1:
		case Input2:
			if (getSituation().display.getText() == "0") {
				getSituation().display.setText(this.toString());
			} else {
				getSituation().display.setText(getSituation().display.getText() + this.toString());				
			}
			break;
		case OpReady:
			getSituation().state = State.Input2;
			getSituation().leftOperand = Integer.parseInt(getSituation().display.getText());
			getSituation().display.setText(this.toString());
			break;
		case HasResult:
			getSituation().state = State.Input1;
			getSituation().display.setText(this.toString());
			break;
		}
	}
	
}
