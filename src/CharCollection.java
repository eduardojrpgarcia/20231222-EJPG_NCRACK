
import java.util.LinkedHashMap;

public class CharCollection {
	
	public static LinkedHashMap<Integer, Character> get() {

		int nNumber = NumberEnum.values().length;
		int nLowerCase = LowerCaseEnum.values().length;
		int nUpperCase = UpperCaseEnum.values().length;
		int nSymbols = SymbolsEnum.values().length;

		LinkedHashMap<Integer, Character> collection = new LinkedHashMap<>();

		int pointer = 0;

		NumberEnum[] numberEnums = NumberEnum.values();
		for (int a = 0; a < nNumber; a++) {
			collection.put(pointer, Character.valueOf(numberEnums[a].getCharacter()));
			pointer += 1;
		}

		LowerCaseEnum[] lowerCaseEnums = LowerCaseEnum.values();
		for (int b = 0; b < nLowerCase; b++) {
			collection.put(pointer, Character.valueOf(lowerCaseEnums[b].getCharacter()));
			pointer += 1;
		}

		UpperCaseEnum[] upperCaseEnums = UpperCaseEnum.values();
		for (int c = 0; c < nUpperCase; c++) {
			collection.put(pointer, Character.valueOf(upperCaseEnums[c].getCharacter()));
			pointer += 1;
		}

		SymbolsEnum[] symbolsEnums = SymbolsEnum.values();
		for (int d = 0; d < nSymbols; d++) {
			collection.put(pointer, Character.valueOf(symbolsEnums[d].getCharacter()));
			pointer += 1;
		}
		
		return collection;
	}

}
