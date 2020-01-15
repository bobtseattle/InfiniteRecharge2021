package frc.team2412.robot.Commands.LiftCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.LiftSubsystem;

public class LiftUp extends CommandBase {

	private LiftSubsystem liftSubsystem;

	public LiftUp(LiftSubsystem liftSubsystem) {
		addRequirements(liftSubsystem);
		this.liftSubsystem = liftSubsystem;
	}

	@Override
	public void execute() {
		// run the example method
		liftSubsystem.liftUp();
	}

	@Override
	public boolean isFinished() {
		return true;
	}

}
