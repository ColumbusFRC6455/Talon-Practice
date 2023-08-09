package frc.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class Drivebase extends SubsystemBase {
    private PWMTalonSRX leftMotor;
    private PWMTalonSRX rightMotor;


    public Drivebase() {
        leftMotor = new PWMTalonSRX(Constants.LEFT_MOTOR.value);
        rightMotor = new PWMTalonSRX(Constants.RIGHT_MOTOR.value);
    }
    public void setRaw(double leftValue, double rightValue){
        leftMotor.set(leftValue);
        rightMotor.set(rightValue);
    }
}
