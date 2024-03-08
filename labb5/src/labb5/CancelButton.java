package labb5;

/**
 * Cancel button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
class CancelButton extends CalculatorButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param text an instanece of String
	 * @param situation an instance of Situation
	 */
	public CancelButton(String text, Situation situation) {
		super(text, situation);
	}

	@Override
	public void transition() {
		switch (getSituation().state) {
		case Input1:
			
			break;
		case OpReady:
			break;
		case Input2:
			break;
		case HasResult:
			break;
		}
	}

}
