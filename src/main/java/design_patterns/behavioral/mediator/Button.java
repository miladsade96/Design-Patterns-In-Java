package design_patterns.behavioral.mediator;

import lombok.Getter;

@Getter
public class Button extends UIControl {
    private boolean isEnabled;


    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
