package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperetaToCommand implements DriverCommand {

    private int x;
    private int y;

    Job2dDriver job2dDriver;

    public OperetaToCommand(int x, int y, Job2dDriver job2dDriver) {
        this.x = x;
        this.y = y;
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void execute() {
        job2dDriver.operateTo(x, y);
    }
}