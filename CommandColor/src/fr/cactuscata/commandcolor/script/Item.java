package fr.cactuscata.commandcolor.script;

import java.util.ArrayList;
import java.util.List;

import fr.cactuscata.commandcolor.utils.Line;
import fr.cactuscata.smartapplication.msg.Message;

public class Item {

	private final String itemName = Message.getMessageInstance().getInput("Veuillez choisir le nom de l'objet");
	private final Line displayName;
	private final int amount = Message.getMessageInstance().getInteger("Veuillez choisir une quantitée d'objet"),
			damage = Message.getMessageInstance().getInteger("Veuillez choisir le damage de l'objet");
	private final List<Line> lore = new ArrayList<>();

	public Item() {
		Message.getMessageInstance().sendMessage("Veuillez choisir le nom de l'objet");
		this.displayName = new Line();
		do {
			Message.getMessageInstance().sendMessage("Veuillez saisir ligne %d de la description", this.lore.size() + 1);
			this.lore.add(new Line());
		} while (Message.getMessageInstance().getInput("Ajouter une ligne ? (O/N)").equalsIgnoreCase("O"));
	}

	public final String build() {
		return String.format("%s %d %d {display:{Name:\\\\\\\\\\\\\\\"%s\\\\\\\\\\\\\\\",Lore:[%s]}}", this.itemName,
				this.amount, this.damage, this.displayName.getLine(), fr.cactuscata.smartapplication.helper.StringUtils.join(this.lore, "\"", "\"", ","));
	}

}
