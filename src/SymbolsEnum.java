
public enum SymbolsEnum {

	// [!@#$&*]
	
	ZERO('!'), ONE('@'), TWO('#'), THREE('$'), FOUR('&'), FIVE('*');
	
	private char value;
	
	private SymbolsEnum(char value) {
		this.value = value;
	}
	
	public char getCharacter() {
		return value;
	}
	
}
