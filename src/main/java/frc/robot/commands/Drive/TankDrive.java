package frc.robot.commands.Drive;

import frc.robot.Robot;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Drive.Drivebase;
import frc.robot.subsystems.Drive.OI;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class TankDrive extends CommandBase {
   public TankDrive(){
    addRequirements(Robot.drivebase);
   }

  

@Override
  public void initialize() {}

  @Override
  public void execute() {
    double throttle = (1.0 - OI.JoyDrive.getThrottle())/ -2.0;;
    Robot.drivebase.setRaw(Robot.oi.getdriveJoyX() * throttle, Robot.oi.getdriveJoyY() * throttle);
  }
    
  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
