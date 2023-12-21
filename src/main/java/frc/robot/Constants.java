// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
//Motor Mappings

public static class DRIVE_MOTORS {
  public static final int LEFT_MOTOR0 = 7,
  public static final int LEFT_MOTOR1 = 4,
  public static final int RIGHT_MOTOR0 = 6,
  public static final int RIGHT_MOTOR = 2,
}
  
  
//Joysticks 
public static class JOYSTICKS {
  public static final int JOY1 = 0,
  public static final int JOY2 = 1,
}

//Arm Motors
public static class ARM_MOTORS {
  public static final int Arm_Motor = 1,
}

public static class ARM{
  public static final int Arm_0_Ang = 0,
  public static final int Arm_90_Ang = 0,
  public static final int Arm_Max_Ang = 0,
  public static final int Arm_Min_Ang = 0,
  public static final int Arm_Test_Ang = 0,

  // Once found real angle subract or add to make 90, 180 or 0
}

public static class PNUEMATICS {
  public static final int pcm = 8,
  public static final int solenoid = 8
}

;
  public final int value;

  Constants(int value)
  {
    this.value = value;
  }
}
