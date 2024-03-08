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
				getSituation().display.setText(this.getText());
			} else {
				getSituation().display.setText(getSituation().display.getText() + this.getText());				
			}
			break;
		case OpReady:
			getSituation().leftOperand = Integer.parseInt(getSituation().display.getText());
			if (getSituation().display.getText() == "0") {
				getSituation().display.setText(this.getText());
			} else {
				getSituation().display.setText(getSituation().display.getText() + this.getText());				
			}
			break;
		case HasResult:
			break;
		}
	}
	
}
