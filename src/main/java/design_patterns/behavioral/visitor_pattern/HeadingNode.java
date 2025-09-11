package design_patterns.behavioral.visitor_pattern;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight heading node");
    }
}
