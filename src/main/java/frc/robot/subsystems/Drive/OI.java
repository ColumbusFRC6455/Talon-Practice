package frc.robot.subsystems.Drive;
import edu.wpi.first.wpilibj.*;
import frc.robot.Constants;

public class OI {
   
    public static final double JOY_DEADZONE = 0.05;

    
    public static Joystick JoyDrive = new Joystick(Constants.JOY_DRIVE.value);
    public static Joystick JoySpare = new Joystick(Constants.JOY_SPARE.value);
    

   public double getdriveJoyX(){
    double raw = JoyDrive.getX();
    return Math.abs(raw) < JOY_DEADZONE ? 0.0 :raw;
   }
   public double getdriveJoyY(){
    double raw = JoyDrive.getY();
    return Math.abs(raw) < JOY_DEADZONE ? 0.0 :raw;
   }


   public double getSpareJoyX(){
    double raw = JoySpare.getX();
    return Math.abs(raw) < JOY_DEADZONE ? 0.0 :raw;
   }
   public double getSpareJoyY(){
    double raw = JoySpare.getY();
    return Math.abs(raw) < JOY_DEADZONE ? 0.0 :raw;
   }

   public OI(){

   }
}
