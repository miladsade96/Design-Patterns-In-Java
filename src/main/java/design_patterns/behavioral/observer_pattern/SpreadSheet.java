package design_patterns.behavioral.observer_pattern;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("SpreadSheet updated");
    }
}
