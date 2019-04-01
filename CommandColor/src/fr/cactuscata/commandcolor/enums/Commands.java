package fr.cactuscata.commandcolor.enums;

import fr.cactuscata.commandcolor.utils.GettableByName;

public enum Commands implements GettableByName {

	GIVE("give");

	private final String commandName;

	private Commands(String commandName) {
		this.commandName = commandName;
	}

	@Override
	public String getName() {
		return this.commandName;
	}

}
