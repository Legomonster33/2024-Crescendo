package frc.robot.subsystems.shooter;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShooterSubsystem extends SubsystemBase{

    // Motor for tilting the Shooter subsystem
    CANSparkMax tiltDrive = new CANSparkMax(10, MotorType.kBrushless);

    // Motor driving the roller-feed
    CANSparkMax noteFeed = new CANSparkMax(12, MotorType.kBrushless);
    // Shooters
    CANSparkMax shooterLeft = new CANSparkMax(13, MotorType.kBrushless);
    CANSparkMax shooterRight = new CANSparkMax(14, MotorType.kBrushless);

    public void runShooter(double speed, boolean isBreakMode){
        shooterLeft.set(speed);
        shooterRight.set(-speed);
        if (isBreakMode) {
            shooterLeft.setIdleMode(IdleMode.kBrake);
        }
    }

}
