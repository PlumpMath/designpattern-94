package com.tobby.designpattern.commandpatter;

public class RemoteControlTest {

	public static void main(String[] args) {
		Light light = new Light("");
		GarageDoor garageDoor = new GarageDoor("");
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);
		Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		Command garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		SimpleRemoteControl control = new SimpleRemoteControl();
		
		control.setCommand(lightOnCommand);
		control.buttonWasPressed();
		control.setCommand(lightOffCommand);
		control.buttonWasPressed();
		control.setCommand(garageDoorOpenCommand);
		control.buttonWasPressed();
		control.setCommand(garageDoorCloseCommand);
		control.buttonWasPressed();
	}

}
