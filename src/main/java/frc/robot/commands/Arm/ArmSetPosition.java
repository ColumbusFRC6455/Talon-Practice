package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;


public class ArmSetPosition extends CommandBase {
  private final ArmSubsystem m_subsystem;

 
  public ArmSetPosition(ArmSubsystem subsystem, double angle) {
    m_subsystem = subsystem;

    addRequirements(ArmSubsystem);
  }

  @Override
  public void initialize() {

    ArmSubsystem.armController.setSetpoint(angle);
    
  }

  @Override
  public void execute() {
    

  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return ArmSubsystem.ArmController.atSetpoint();
  }
}
