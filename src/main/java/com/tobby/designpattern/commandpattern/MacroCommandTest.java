package com.tobby.designpattern.commandpattern;

public class MacroCommandTest {

	public static void main(String[] args) {
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand lightOn = new LightOnCommand(light);
		TVOnCommand tvOn = new TVOnCommand(tv);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

		LightOffCommand lightOff = new LightOffCommand(light);
		TVOffCommand tvOff = new TVOffCommand(tv);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		Command[] partyOn = {lightOn, stereoOn, tvOn};
		Command[] partyOff = {lightOff, stereoOff, tvOff};

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println(remoteControl);
		System.out.println("-----Pushing Macro On-----");
		remoteControl.onButtonWasPressed(0);
		System.out.println("-----Pushing Macro Off-----");
		remoteControl.offButtonWasPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoCommandWasPressed();
	}

}
