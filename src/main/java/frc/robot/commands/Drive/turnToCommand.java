package frc.robot.commands.Drive;

import java.lang.module.ModuleDescriptor.Requires;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;


public class turnToCommand extends CommandBase{
    double Angle;
    boolean isFinished;
    boolean inErrorZone  = false;    
    int count;
    public turnToCommand(double angle){
        addRequirements(Robot.drivebase);
        Angle = angle;
    }
    @Override
    public void initialize() {
        Robot.drivebase.rotateDegrees(Angle);
    }
  
    @Override
    public void execute() {
        // getting the error on the PID
        double error = Robot.drivebase.turnController.getPositionError();
        inErrorZone = Math.abs(error)<2;

        if (inErrorZone){
            count++;
            isFinished = count >=5;
        }
    }
  
    @Override
    public void end(boolean interrupted) {
        Robot.drivebase.turnController.disableContinuousInput();
    }
  
    @Override
    public boolean isFinished() {
      return isFinished;
    }
}
