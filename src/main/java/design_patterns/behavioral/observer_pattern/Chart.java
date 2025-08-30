package design_patterns.behavioral.observer_pattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Chart implements Observer {

    private DataSource dataSource;

    @Override
    public void update() {
        System.out.println("Chart updated: " + dataSource.getValue());
    }
}
