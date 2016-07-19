package TheGame.TheGame;

public enum Scheme {

	ROCK, PAPER, SCISSOR;

	public static Scheme parseType(String value) {
		if (value.equals("ROCK")) {
			return ROCK;
		} else if (value.equals("PAPER")) {
			return PAPER;
		} else if (value.equals("SCISSOR")) {
			return SCISSOR;
		} else {
			return null;
		}
	}
}