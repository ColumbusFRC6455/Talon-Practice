package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.CANCoder;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import com.kauailabs.navx.frc.*;

public class Drivebase extends SubsystemBase implements PIDoutput {
public ArmSubsystem() { 
    arm_motor = new TalonSRX(Constants.ARM_MOTORS.Arm_Motor.value);
    armController = new PIDController(kP, kI, kD);
    coder = new CanCoder();
    

    ahrs = new AHRS(SPI.Port.kMXP);

    Robot.initTalon(arm_motor);

    leftMotor0.enableCurrentLimit(false);

    
    armController.setIntegratorRange(-180.0f, 180.0f);
    armController.setTolerance(2.0f);
    armController.calculate(kD);
    armController.enableContinuousInput(kI, kD);
    
    public void rotateDegrees(double angle){
        ahrs.reset();
        armController.reset();
        armController.setPID(kP, kI, kD); //reasonable first guess would be .01 assuming input in degree, output is in percent
        armController.setSetpoint(angle);
        armController.calculate(angle);
    }
    @Override
    public void pidWrite(double output) {
        set(ControlMode.PercentOutput, -output, output);        
    }
    @Override
    public void periodic() {
    arm_motor.set(armController.calculate(coder.getAbsolutePosition()));
    system.out.println(coder.getAbsolutePosition());
    }
    }   
}
