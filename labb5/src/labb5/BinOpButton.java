package labb5;

/**
 * Binary operator button
 * @author Kasper Axelsson
 * @author Zeb Muhlbach
 */
class BinOpButton extends CalculatorButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param text An instanece of String
	 * @param situation An instance of Situation
	 */
	public BinOpButton(String text, Situation situation) {
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
