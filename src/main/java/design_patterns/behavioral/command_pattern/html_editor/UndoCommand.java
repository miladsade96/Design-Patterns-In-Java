package design_patterns.behavioral.command_pattern.html_editor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UndoCommand implements Command {

    private History history;

    @Override
    public void execute() {
        if (history.size() > 0) {
            history.pop().unexecute();
        }
    }
}
