package design_patterns.behavioral.command_pattern.html_editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
