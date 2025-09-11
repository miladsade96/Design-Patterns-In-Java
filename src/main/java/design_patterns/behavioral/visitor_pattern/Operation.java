package design_patterns.behavioral.visitor_pattern;

public interface Operation {
    void apply(HeadingNode headingNode);

    void apply(AnchorNode anchorNode);
}
