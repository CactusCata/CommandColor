package fr.cactuscata.commandcolor.enums;

import fr.cactuscata.commandcolor.utils.GettableByName;

public enum Type implements GettableByName {

	BOLD("gras", '1'),
	UNDERLINE("sous ligné", 'n'),
	ITALIC("italic", 'o'),
	OBFUSCATED("Offusqué", 'k'),
	STRIKETHOUGHT("Sur ligné", 'm');
	
	private final String colorCode, colorName;

	private Type(String colorName, char colorValue) {
		this.colorCode = Color.concatenateCode(colorValue);
		this.colorName = colorName;
	}

	public String getColorCode() {
		return this.colorCode;
	}

	@Override
	public String getName() {
		return this.colorName;
	}
	
}
