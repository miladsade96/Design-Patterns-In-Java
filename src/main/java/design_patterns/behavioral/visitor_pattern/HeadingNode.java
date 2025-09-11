package design_patterns.behavioral.visitor_pattern;

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
