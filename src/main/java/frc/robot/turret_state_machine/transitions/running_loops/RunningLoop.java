package frc.robot.turret_state_machine.transitions.running_loops;

import frc.robot.turret_state_machine.Transition;

public abstract class RunningLoop<State extends Enum<?>, RobotData> extends Transition<State, RobotData> {

    /** A transition leading from a node back into the same node */
    public RunningLoop(State runningState) {
        super(runningState);
    }

    @Override
    public final boolean shouldExecute(RobotData robotData) {
        return true;
    }

    @Override
    public final State execute(RobotData robotData) {
        run(robotData);
        return to;
    }

    /** Called periodically while the node is running */
    protected abstract void run(RobotData robotData);
}
