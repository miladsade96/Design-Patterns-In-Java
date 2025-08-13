package design_patterns.behavioral.state_pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Canvas {

    private ToolType currentTool;

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION) System.out.println("Selection Icon");
        else if (currentTool == ToolType.BRUSH) System.out.println("Brush Icon");
        else if (currentTool == ToolType.ERASER) System.out.println("Eraser Icon");
    }

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION) System.out.println("Draw Dashed Rectangle");
        else if (currentTool == ToolType.BRUSH) System.out.println("Draw A Line");
        else if (currentTool == ToolType.ERASER) System.out.println("Erase Something");
    }
}
