package design_patterns.behavioral.observer_pattern;

import lombok.Getter;

@Getter
public class DataSource extends Subject {
    private int value;

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }
}
