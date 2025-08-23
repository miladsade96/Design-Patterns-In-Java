package design_patterns.behavioral.strategy_pattern;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying b&w filter");
    }
}
