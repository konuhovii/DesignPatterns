package command1;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void queryCommand() {
        command.execute();
    }

    public void undoCommand() {
        command.undo();
    }
}
