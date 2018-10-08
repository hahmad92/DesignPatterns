package design.patterns.command.headfirst.undo;

public interface Command {
	public void execute();

	public void undo();
}
