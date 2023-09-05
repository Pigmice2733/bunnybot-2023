// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final double AXIS_THRESHOLD = 0.1;

    public static final ShuffleboardTab TURRET_TAB = Shuffleboard.getTab("Turret");

    public static final class CANConfig {
        public static final int ROTATE_TURRET = 20;
    }

    public static final class TurretConfig {
        public static final double MANUAL_ROTATION_SPEED = 3;

        private static final double ROTATION_GEAR_RATIO = 1;
        public static final double ROTATION_MOTOR_CONVERSION = ROTATION_GEAR_RATIO * 360; // encoder rot to deg

        public static final double ROTATION_P = 0.001;
        public static final double ROTATION_I = 0.0;
        public static final double ROTATION_D = 0.0;

        public static final double MAX_VELOCITY = 30; // deg/sec
        public static final double MAX_ACCELERATION = 30; // deg/sec/sec
    }

    public static final class ShooterConfig {

    }

    public static final class IntakeConfig {

    }

    public static final class VisionConfig {
        public static final double TARGET_HEIGHT_METERS = 1; // TODO

        public static final double CAMERA_HEIGHT_METERS = 1; // TODO
        public static final double CAMERA_PITCH_RADIANS = 0; // TODO
    }
}
