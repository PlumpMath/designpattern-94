package com.tobby.designpattern.commandpatter;

public class NewCeilingFanMediumCommand implements Command {

	private NewCeilingFan ceilingFan;

	private int previousSpeed;

	public NewCeilingFanMediumCommand(NewCeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		if (previousSpeed == NewCeilingFan.HIGH) {
			ceilingFan.high();
		} else if (previousSpeed == NewCeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (previousSpeed == NewCeilingFan.LOW) {
			ceilingFan.low();
		} else if (previousSpeed == NewCeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
