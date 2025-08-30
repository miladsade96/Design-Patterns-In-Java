package design_patterns.behavioral.observer_pattern;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart updated: " + value);
    }
}
