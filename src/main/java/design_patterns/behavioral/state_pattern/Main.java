package design_patterns.behavioral.state_pattern;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
