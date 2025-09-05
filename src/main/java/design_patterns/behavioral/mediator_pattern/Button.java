package design_patterns.behavioral.mediator_pattern;

import lombok.Getter;

@Getter
public class Button extends UIControl {
    private boolean isEnabled;


    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
