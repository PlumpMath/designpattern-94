package com.tobby.designpattern.commandpattern;

public class RemoteLoaderWithUndo {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoCommandWasPressed();

		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoCommandWasPressed();
	}

}
