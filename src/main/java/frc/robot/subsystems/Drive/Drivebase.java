package frc.robot.subsystems.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import com.kauailabs.navx.frc.*;

public class Drivebase extends SubsystemBase implements PIDoutput {
    private TalonSRX leftMotor0;
    private TalonSRX rightMotor0;
    private TalonSRX leftMotor1;
    private TalonSRX rightMotor1;
    public final PIDController turnController;
    private final AHRS ahrs;
    

    private final double kP = 0;
    private final double kI = 0;
    private final double kD = 0;

    public Drivebase() { 
        leftMotor0 = new TalonSRX(Constants.DRIVE_MOTORS.LEFT_MOTOR0.value);
        rightMotor0 = new TalonSRX(Constants.DRIVE_MOTORS.RIGHT_MOTOR0.value);
        leftMotor1 = new TalonSRX(Constants.DRIVE_MOTORS.LEFT_MOTOR1.value);
        rightMotor1 = new TalonSRX(Constants.DRIVE_MOTORS.RIGHT_MOTOR1.value);

        

        ahrs = new AHRS(SPI.Port.kMXP);

        Robot.initTalon(leftMotor0);
        Robot.initTalon(rightMotor0);
        Robot.initTalon(leftMotor1);
        Robot.initTalon(rightMotor1);
        leftMotor1.follow(leftMotor0);
        rightMotor1.follow(rightMotor0);

        leftMotor0.enableCurrentLimit(false);

        turnController = new PIDController(kP, kI, kD);
        turnController.setIntegratorRange(-180.0f, 180.0f);
        turnController.setTolerance(2.0f);
        turnController.calculate(kD);
        turnController.enableContinuousInput(kI, kD);
    }

    public void rotateDegrees(double angle){
        ahrs.reset();
        turnController.reset();
        turnController.setPID(kP, kI, kD);
        turnController.setSetpoint(angle);
        turnController.calculate(angle);
    }
    public void set(ControlMode mode, double leftValue, double rightValue){
        leftMotor0.set(mode, leftValue);
        rightMotor0.set(mode, rightValue);
    }
    @Override
    public void pidWrite(double output) {
        set(ControlMode.PercentOutput, -output, output);        
    }
   
}
