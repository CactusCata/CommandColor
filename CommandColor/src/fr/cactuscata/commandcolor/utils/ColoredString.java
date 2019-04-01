package fr.cactuscata.commandcolor.utils;

import fr.cactuscata.commandcolor.enums.Color;
import fr.cactuscata.commandcolor.enums.Type;
import fr.cactuscata.smartapplication.msg.Message;

public class ColoredString {

	private final String text = Message.getMessageInstance().getInput("Veuillez séléctioner le texte"),
			color = EnumHelper.getByName(Color.class), type = EnumHelper.getByName(Type.class);

	public String render() {
		return String.format("%s%s%s", this.color, this.type, this.text);
	}

}
