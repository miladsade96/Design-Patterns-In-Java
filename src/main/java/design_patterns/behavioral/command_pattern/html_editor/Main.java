package design_patterns.behavioral.command_pattern.html_editor;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello World!");

        BoldCommand boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();
        System.out.println(htmlDocument.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(htmlDocument.getContent());
    }
}
