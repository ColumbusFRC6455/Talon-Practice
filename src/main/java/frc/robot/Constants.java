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
public enum Constants {
//Motor Mappings
  LEFT_MOTOR0(0),
  LEFT_MOTOR1(2),
  RIGHT_MOTOR0(1),
  RIGHT_MOTOR1(3),
  
//Joysticks 
JOY_DRIVE(0),
JOY_SPARE(1)

;
  public final int value;

  Constants(int value)
  {
    this.value = value;
  }
}
