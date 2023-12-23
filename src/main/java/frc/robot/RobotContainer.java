// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
 
  public static Joystick joy1 = new Joystick(Constants.JOYSTICKS.JOY1);
  public Joystick joy2 = new Joystick(Constants.JOYSTICKS.JOY2);
  
  public static PneumaticsControlModule pcm = new PneumaticsControlModule(Constants.PNUEMATICS.pcm);
  public static DoubleSolenoid solenoid = new DoubleSolenoid(Constants.PNUEMATICS.solenoid, PneumaticsModuleType.CTREPCM, 4, 5);

 ArmSetPosition ArmCommand1 = new ArmSetPosition(ArmSubsystem, Constants.ARM.Arm_0_Ang);
 ArmSetPosition ArmCommand2 = new ArmSetPosition(ArmSubsystem, Constants.ARM.Arm_90_Ang);
 ArmSetPosition ArmCommand3 = new ArmSetPosition(ArmSubsystem, Constants.ARM.Arm_Max_Ang);
 ArmSetPosition ArmCommand4 = new ArmSetPosition(ArmSubsystem, Constants.ARM.Arm_Min_Ang);
 ArmPnuematicsComm ArmPnuematics1 = new ArmOpenComm(ArmOpen);
 ArmPnuematicsComm ArmPnuematics2 = new ArmCloseComm(ArmClose);
  public RobotContainer() {

    configureBindings();
  }

  private void configureBindings() {
   joy2.button(1).onTrue(ArmCommand1);
   joy2.button(2).onTrue(ArmCommand2);
   joy2.button(3).onTrue(ArmCommand3);
   joy2.button(4).onTrue(ArmCommand4);
   joy2.button(5).onTrue(ArmPnuematics1);
   joy2.button(6).onTrue(ArmPnuematics2);
  }


  public Command getAutonomousCommand() {
    
}
}
