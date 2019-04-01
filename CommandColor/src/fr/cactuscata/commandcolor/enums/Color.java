package fr.cactuscata.commandcolor.enums;

import fr.cactuscata.commandcolor.utils.GettableByName;

public enum Color implements GettableByName {

	RED("rouge", 'c'),
	DARK_RED("rouge fonc�", '4'),
	YELLOW("jaune", 'e'),
	DARK_YELLOW("jaune fonc�", '6'),
	GREEN("vert", 'a'),
	DARK_GREEN("vert fonc�", '2'),
	AQUA("bleu marine", 'b'),
	DARK_AQUA("bleu marine fonc�", '3'),
	BLUE("bleu", '9'),
	DARK_BLUE("bleu fonc�", '1'),
	PINK("rose", 'd'),
	MAGENTA("violet", '5'),
	WHITE("blanc", 'f'),
	GREY("gris", '8'),
	DARK_GRAY("gris fonc�", '7'),
	BLACK("noir", '0');

	private final String colorCode, colorName;

	private Color(String colorName, char colorValue) {
		this.colorCode = concatenateCode(colorValue);
		this.colorName = colorName;
	}

	public String getColorCode() {
		return this.colorCode;
	}

	@Override
	public String getName() {
		return this.colorName;
	}
	
	public static String concatenateCode(char colorValue) {
		return String.valueOf('\u00a7') + String.valueOf(colorValue);
	}

}
