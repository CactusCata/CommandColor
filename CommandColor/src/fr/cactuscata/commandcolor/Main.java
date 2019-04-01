package fr.cactuscata.commandcolor;

import fr.cactuscata.commandcolor.script.Script;
import fr.cactuscata.smartapplication.SmartApplicationBox;
import fr.cactuscata.smartapplication.msg.MessageType;

public class Main {

	public static void main(String[] args) {
		new SmartApplicationBox("CommandColor", MessageType.CONSOLE) {

			@Override
			public void launchScript() {
				new Script().start();
			}
		};
	}

}
