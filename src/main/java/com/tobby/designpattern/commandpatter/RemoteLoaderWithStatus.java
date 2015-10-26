package com.tobby.designpattern.commandpatter;

public class RemoteLoaderWithStatus {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		NewCeilingFan ceilingFan = new NewCeilingFan("Living Room");
		NewCeilingFanMediumCommand ceilingFanMediumCommand = new NewCeilingFanMediumCommand(ceilingFan);
		NewCeilingFanHighCommand ceilingFanHighCommand = new NewCeilingFanHighCommand(ceilingFan);
		NewCeilingFanOffCommand ceilingFanOffCommand = new NewCeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoCommandWasPressed();

		remoteControl.onButtonWasPressed(1);
		System.out.println(remoteControl);
		remoteControl.undoCommandWasPressed();
	}

}
