package design_patterns.behavioral.strategy_pattern;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying high-contrast filter");
    }
}
