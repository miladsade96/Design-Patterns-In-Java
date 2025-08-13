package design_patterns.behavioral.state_pattern;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw A Dashed Rectangle");
    }
}
