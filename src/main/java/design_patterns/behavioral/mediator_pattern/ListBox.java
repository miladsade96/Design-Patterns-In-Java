package design_patterns.behavioral.mediator_pattern;

import lombok.Getter;

@Getter
public class ListBox extends UIControl {
    private String selection;

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
