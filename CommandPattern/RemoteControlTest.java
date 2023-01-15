public class RemoteControlTest {
    public static void main(String[] args) {
        // SimpleRemoteControl rc = new SimpleRemoteControl();
        RemoteControl rc = new RemoteControl();
        Light testLight = new Light();
        LightOnCommand lightOn = new LightOnCommand(testLight);
        LightOffCommand lightOff = new LightOffCommand(testLight);
        rc.setCommand(0, lightOn, lightOff);

        // rc.setCommand(lightOn);
        rc.onButtonWasPressed(0);
        rc.offButtonWasPressed(0);
        rc.undoButtonWasPressed();
    }
}
