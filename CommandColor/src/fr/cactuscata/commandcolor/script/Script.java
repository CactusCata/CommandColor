package fr.cactuscata.commandcolor.script;

import fr.cactuscata.commandcolor.enums.Commands;
import fr.cactuscata.commandcolor.utils.EnumHelper;
import fr.cactuscata.smartapplication.msg.Message;

public final class Script {

	public void start() {
		
		do {
			Message.getMessageInstance().getInput(
					String.format(
							"/setblock ~1 ~ ~ minecraft:wall_sign 5 replace {Text1:\"{text:\\\"Click\\\",clickEvent:{action:\\\"run_command\\\",value:\\\"blockdata ~-1 ~ ~ {Command:%s @p %s}\\\"}}\"}",
							EnumHelper.getByName(Commands.class),
							new Item().build()),
					"Copier coller");
		} while (Message.getMessageInstance().getInput("Recommencer ? (O/N)").equalsIgnoreCase("O"));

	}

}
