package design_patterns.behavioral.command_pattern.html_editor;

public class BoldCommand implements UndoableCommand {

    private String previousContent;
    private HtmlDocument htmlDocument;
    private History history;

    public BoldCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }


    @Override
    public void unexecute() {
        htmlDocument.setContent(previousContent);
    }

    @Override
    public void execute() {
        previousContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }
}
