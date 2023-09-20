// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.TurretStateMachine;
import frc.robot.subsystems.Turret;
import frc.robot.subsystems.Vision;

public class RotateTurretAutomatic extends CommandBase {
    private final TurretStateMachine stateMachine;

    public RotateTurretAutomatic(Turret turret, Vision vision) {
        this.stateMachine = new TurretStateMachine(turret, vision);
        addRequirements(turret, vision);
    }

    @Override
    public void execute() {
        super.execute();
        stateMachine.updateCurrentState();
    }
}
