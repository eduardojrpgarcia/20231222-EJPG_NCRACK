
public enum NumberEnum {
	
	ZERO('0'), ONE('1'), TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE('9');
	
	private char value;
	
	private NumberEnum(char value) {
		this.value = value;
	}
	
	public char getCharacter() {
		return value;
	}
	
}
