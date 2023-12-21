package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;


public class ArmPnuematicsComm extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ArmPnuematics m_subsystem;

 
  public ArmPnuematicsComm(ArmClose subsystem) {
    m_subsystem = subsystem;

    addRequirements(subsystem);
  }

  @Override
  public void initialize() {

  }

  @Override
  public void execute() {

  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false, system.out.println("Closed Claw");
  }
}
