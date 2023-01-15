public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command cmd) {
        slot = cmd;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
