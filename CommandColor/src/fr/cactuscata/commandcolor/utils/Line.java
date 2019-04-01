package fr.cactuscata.commandcolor.utils;

import java.util.ArrayList;
import java.util.List;

import fr.cactuscata.smartapplication.helper.StringUtils;
import fr.cactuscata.smartapplication.msg.Message;

public class Line {

	private final List<ColoredString> line = new ArrayList<>();

	public Line() {
		do {
			this.line.add(new ColoredString());
		} while (Message.getMessageInstance().getInput("Continuer à ajouter du texte ? (O/N)").equalsIgnoreCase("O"));
	}
	
	public final String getLine() {
		return StringUtils.join(this.line);
	}

}
