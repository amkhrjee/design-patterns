public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCmd, Command offCmd) {
        onCommands[slot] = onCmd;
        offCommands[slot] = offCmd;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("\n--------Remote Control---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            strBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " "
                    + offCommands[i].getClass().getName());
        }
        return strBuff.toString();
    }

}
