package design_patterns.behavioral.mediator_pattern;

import lombok.Getter;

@Getter
public class TextBox extends UIControl {
    private String content;

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
