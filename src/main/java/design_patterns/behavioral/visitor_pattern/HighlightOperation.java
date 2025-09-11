package design_patterns.behavioral.visitor_pattern;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Highlight heading node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlight anchor node");
    }
}
