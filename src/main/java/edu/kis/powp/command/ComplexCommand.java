package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand {

    private List<DriverCommand> driverCommands;

    public ComplexCommand(List<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    public void executeOperations() {
        driverCommands.forEach(DriverCommand::execute);
    }

}
