public class NoCommand implements Command {
    public void execute() {
        System.out.println("This does nothing");
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub

    }
}
