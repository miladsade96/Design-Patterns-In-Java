package design_patterns.behavioral.visitor_pattern;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight anchor node");
    }
}
