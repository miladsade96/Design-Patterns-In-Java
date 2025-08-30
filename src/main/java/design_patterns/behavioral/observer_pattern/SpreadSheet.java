package design_patterns.behavioral.observer_pattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SpreadSheet implements Observer {

    private DataSource dataSource;

    @Override
    public void update() {
        System.out.println("SpreadSheet updated: " + dataSource.getValue());
    }
}
