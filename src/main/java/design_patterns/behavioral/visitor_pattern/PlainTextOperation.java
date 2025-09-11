package design_patterns.behavioral.visitor_pattern;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Plain text for heading node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Plain text for anchor node");
    }
}
