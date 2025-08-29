package design_patterns.behavioral.command_pattern.photoshop_project;

import design_patterns.behavioral.command_pattern.fw.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing");
    }
}
