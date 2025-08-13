package design_patterns.behavioral.state_pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Canvas {

    private Tool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }
}
