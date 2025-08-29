package design_patterns.behavioral.command_pattern.html_editor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HtmlDocument {
    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }
}
