package design_patterns.behavioral.observer_pattern;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet updated: " + value);
    }
}
