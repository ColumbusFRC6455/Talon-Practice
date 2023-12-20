package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;


public class ArmSetPosition extends CommandBase {
  private final Arm m_subsystem;

 
  public ArmSetPosition(Arm subsystem, double angle) {
    m_subsystem = subsystem;

    addRequirements(Arm);
  }

  @Override
  public void initialize() {

    Arm.armController.setSetpoint(angle);
    
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
