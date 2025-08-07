package design_patterns.behavioral.momento_pattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("Version 1");
        history.push(editor.createState());
        editor.setContent("Version 2");
        history.push(editor.createState());
        editor.setContent("Version 3");

        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent());
    }
}
