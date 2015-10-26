package com.tobby.designpattern.commandpatter;

public class NewCeilingFanLowCommand implements Command {

	private NewCeilingFan ceilingFan;

	private int previousSpeed;

	public NewCeilingFanLowCommand(NewCeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
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
